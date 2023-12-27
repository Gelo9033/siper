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
public class PissIessIssfaId implements Serializable {
    private static final long serialVersionUID = 3883641233771979501L;
    @Size(max = 15)
    @NotNull
    @Column(name = "ISS_CODIGO_SEGURO", nullable = false, length = 15)
    private String issCodigoSeguro;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PissIessIssfaId entity = (PissIessIssfaId) o;
        return Objects.equals(this.memCedula, entity.memCedula) &&
                Objects.equals(this.issCodigoSeguro, entity.issCodigoSeguro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memCedula, issCodigoSeguro);
    }

}