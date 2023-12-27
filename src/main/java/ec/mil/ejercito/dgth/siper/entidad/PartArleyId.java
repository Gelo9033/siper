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
public class PartArleyId implements Serializable {
    private static final long serialVersionUID = 6413191425835667236L;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PartArleyId entity = (PartArleyId) o;
        return Objects.equals(this.artAnio, entity.artAnio) &&
                Objects.equals(this.regCodigor, entity.regCodigor) &&
                Objects.equals(this.artLey, entity.artLey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artAnio, regCodigor, artLey);
    }

}