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
public class PlanLAnuId implements Serializable {
    private static final long serialVersionUID = -7769180642062547354L;
    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "LAN_FECINI", nullable = false)
    private LocalDate lanFecini;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlanLAnuId entity = (PlanLAnuId) o;
        return Objects.equals(this.lanFecini, entity.lanFecini) &&
                Objects.equals(this.memCedula, entity.memCedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lanFecini, memCedula);
    }

}