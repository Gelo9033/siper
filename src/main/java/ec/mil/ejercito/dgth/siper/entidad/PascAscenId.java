package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PascAscenId implements Serializable {
    private static final long serialVersionUID = -6600808081944580547L;
    @NotNull
    @Column(name = "GMI_CODIGO", nullable = false)
    private Short gmiCodigo;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PascAscenId entity = (PascAscenId) o;
        return Objects.equals(this.memCedula, entity.memCedula) &&
                Objects.equals(this.gmiCodigo, entity.gmiCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memCedula, gmiCodigo);
    }

}