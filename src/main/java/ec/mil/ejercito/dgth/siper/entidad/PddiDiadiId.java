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
public class PddiDiadiId implements Serializable {
    private static final long serialVersionUID = 8760413654216893327L;
    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "DDI_ANIO", nullable = false)
    private LocalDate ddiAnio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PddiDiadiId entity = (PddiDiadiId) o;
        return Objects.equals(this.ddiAnio, entity.ddiAnio) &&
                Objects.equals(this.memCedula, entity.memCedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddiAnio, memCedula);
    }

}