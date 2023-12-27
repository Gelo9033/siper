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
public class MporPuorgId implements Serializable {
    private static final long serialVersionUID = -5594338388638704657L;
    @Size(max = 9)
    @NotNull
    @Column(name = "PUE_CODIGO2", nullable = false, length = 9)
    private String pueCodigo2;

    @NotNull
    @Column(name = "PUN_CLASEC", nullable = false)
    private Long punClasec;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MporPuorgId entity = (MporPuorgId) o;
        return Objects.equals(this.pueCodigo2, entity.pueCodigo2) &&
                Objects.equals(this.punClasec, entity.punClasec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pueCodigo2, punClasec);
    }

}