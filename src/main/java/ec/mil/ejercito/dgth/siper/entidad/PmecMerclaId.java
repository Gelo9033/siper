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
public class PmecMerclaId implements Serializable {
    private static final long serialVersionUID = -3851300704535820439L;
    @NotNull
    @Column(name = "MEC_M_D", nullable = false)
    private Boolean mecMD = false;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEC_CODMER", nullable = false, length = 15)
    private String mecCodmer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PmecMerclaId entity = (PmecMerclaId) o;
        return Objects.equals(this.mecMD, entity.mecMD) &&
                Objects.equals(this.mecCodmer, entity.mecCodmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mecMD, mecCodmer);
    }

}