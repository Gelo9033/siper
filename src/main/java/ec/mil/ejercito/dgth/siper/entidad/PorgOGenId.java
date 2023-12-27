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
public class PorgOGenId implements Serializable {
    private static final long serialVersionUID = 3886704762571348909L;
    @Size(max = 15)
    @NotNull
    @Column(name = "ORG_NUMERO", nullable = false, length = 15)
    private String orgNumero;

    @NotNull
    @Column(name = "TOG_CODIGO", nullable = false)
    private Short togCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PorgOGenId entity = (PorgOGenId) o;
        return Objects.equals(this.orgNumero, entity.orgNumero) &&
                Objects.equals(this.togCodigo, entity.togCodigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgNumero, togCodigo);
    }

}