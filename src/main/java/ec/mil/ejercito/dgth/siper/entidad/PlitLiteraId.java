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
public class PlitLiteraId implements Serializable {
    private static final long serialVersionUID = -5530184325083951956L;
    @NotNull
    @Column(name = "REG_CODIGOR", nullable = false)
    private Short regCodigor;

    @Size(max = 4)
    @NotNull
    @Column(name = "ART_ANIO", nullable = false, length = 4)
    private String artAnio;

    @NotNull
    @Column(name = "ART_LEY", nullable = false)
    private Short artLey;

    @NotNull
    @Column(name = "LIT_LITER", nullable = false)
    private Short litLiter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlitLiteraId entity = (PlitLiteraId) o;
        return Objects.equals(this.artAnio, entity.artAnio) &&
                Objects.equals(this.litLiter, entity.litLiter) &&
                Objects.equals(this.regCodigor, entity.regCodigor) &&
                Objects.equals(this.artLey, entity.artLey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artAnio, litLiter, regCodigor, artLey);
    }

}