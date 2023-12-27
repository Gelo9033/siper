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
public class MgfuGfuncId implements Serializable {
    private static final long serialVersionUID = -4986824787184257637L;
    @Size(max = 8)
    @NotNull
    @Column(name = "AFU_CODIGO", nullable = false, length = 8)
    private String afuCodigo;

    @Size(max = 8)
    @NotNull
    @Column(name = "GFU_CODIGO", nullable = false, length = 8)
    private String gfuCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MgfuGfuncId entity = (MgfuGfuncId) o;
        return Objects.equals(this.gfuCodigo, entity.gfuCodigo) &&
                Objects.equals(this.afuCodigo, entity.afuCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gfuCodigo, afuCodigo);
    }

}