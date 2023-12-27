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
public class MgruGrupoId implements Serializable {
    private static final long serialVersionUID = 3247535947579347724L;
    @Size(max = 5)
    @NotNull
    @Column(name = "SOC_CODIGO", nullable = false, length = 5)
    private String socCodigo;

    @Size(max = 5)
    @NotNull
    @Column(name = "GRU_CODIGO", nullable = false, length = 5)
    private String gruCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MgruGrupoId entity = (MgruGrupoId) o;
        return Objects.equals(this.gruCodigo, entity.gruCodigo) &&
                Objects.equals(this.socCodigo, entity.socCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gruCodigo, socCodigo);
    }

}