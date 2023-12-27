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
public class PfalFaltaId implements Serializable {
    private static final long serialVersionUID = 6806090895856945493L;
    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "FAL_FALTA", nullable = false)
    private LocalDate falFalta;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PfalFaltaId entity = (PfalFaltaId) o;
        return Objects.equals(this.memCedula, entity.memCedula) &&
                Objects.equals(this.falFalta, entity.falFalta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memCedula, falFalta);
    }

}