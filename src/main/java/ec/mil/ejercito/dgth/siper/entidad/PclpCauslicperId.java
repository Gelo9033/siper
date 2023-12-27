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
public class PclpCauslicperId implements Serializable {
    private static final long serialVersionUID = 5168331629831494272L;
    @NotNull
    @Column(name = "LAN_TIPOSOL", nullable = false)
    private Boolean lanTiposol = false;

    @Size(max = 5)
    @NotNull
    @Column(name = "CLP_CODIGO", nullable = false, length = 5)
    private String clpCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PclpCauslicperId entity = (PclpCauslicperId) o;
        return Objects.equals(this.lanTiposol, entity.lanTiposol) &&
                Objects.equals(this.clpCodigo, entity.clpCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lanTiposol, clpCodigo);
    }

}