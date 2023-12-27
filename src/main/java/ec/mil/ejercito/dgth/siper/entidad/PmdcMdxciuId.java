package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PmdcMdxciuId implements Serializable {
    private static final long serialVersionUID = 4957631569165850790L;
    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "MEC_M_D", nullable = false)
    private Boolean mecMD = false;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEC_CODMER", nullable = false, length = 15)
    private String mecCodmer;

    @NotNull
    @Column(name = "MDC_FECHA_MD", nullable = false)
    private LocalDate mdcFechaMd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PmdcMdxciuId entity = (PmdcMdxciuId) o;
        return Objects.equals(this.memCedula, entity.memCedula) &&
                Objects.equals(this.mecMD, entity.mecMD) &&
                Objects.equals(this.mdcFechaMd, entity.mdcFechaMd) &&
                Objects.equals(this.mecCodmer, entity.mecCodmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memCedula, mecMD, mdcFechaMd, mecCodmer);
    }

}