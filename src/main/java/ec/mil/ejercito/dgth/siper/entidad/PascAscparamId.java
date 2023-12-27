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
public class PascAscparamId implements Serializable {
    private static final long serialVersionUID = 4918031644934146676L;
    @NotNull
    @Column(name = "ASC_CODIGO", nullable = false)
    private Integer ascCodigo;

    @NotNull
    @Column(name = "GMI_CODIGO", nullable = false)
    private Short gmiCodigo;

    @Size(max = 8)
    @NotNull
    @Column(name = "AFU_CODIGO", nullable = false, length = 8)
    private String afuCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PascAscparamId entity = (PascAscparamId) o;
        return Objects.equals(this.ascCodigo, entity.ascCodigo) &&
                Objects.equals(this.afuCodigo, entity.afuCodigo) &&
                Objects.equals(this.gmiCodigo, entity.gmiCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ascCodigo, afuCodigo, gmiCodigo);
    }

}