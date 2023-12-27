package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PsalSalidaId implements Serializable {
    private static final long serialVersionUID = -7657188835568485344L;
    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "LAN_FECINI", nullable = false)
    private LocalDate lanFecini;

    @NotNull
    @Column(name = "SAL_FECSAL", nullable = false)
    private LocalDate salFecsal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PsalSalidaId entity = (PsalSalidaId) o;
        return Objects.equals(this.lanFecini, entity.lanFecini) &&
                Objects.equals(this.memCedula, entity.memCedula) &&
                Objects.equals(this.salFecsal, entity.salFecsal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lanFecini, memCedula, salFecsal);
    }

}