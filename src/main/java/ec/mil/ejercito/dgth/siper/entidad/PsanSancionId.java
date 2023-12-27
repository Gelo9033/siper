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
public class PsanSancionId implements Serializable {
    private static final long serialVersionUID = 9214241362181891542L;
    @NotNull
    @Column(name = "TFA_CODIGO", nullable = false)
    private Boolean tfaCodigo = false;

    @NotNull
    @Column(name = "MEC_M_D", nullable = false)
    private Boolean mecMD = false;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEC_CODMER", nullable = false, length = 15)
    private String mecCodmer;

    @Size(max = 5)
    @NotNull
    @Column(name = "CSE_CLACOD", nullable = false, length = 5)
    private String cseClacod;

    @NotNull
    @Column(name = "TEF_CODIGO", nullable = false)
    private Short tefCodigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PsanSancionId entity = (PsanSancionId) o;
        return Objects.equals(this.cseClacod, entity.cseClacod) &&
                Objects.equals(this.tefCodigo, entity.tefCodigo) &&
                Objects.equals(this.mecMD, entity.mecMD) &&
                Objects.equals(this.tfaCodigo, entity.tfaCodigo) &&
                Objects.equals(this.mecCodmer, entity.mecCodmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cseClacod, tefCodigo, mecMD, tfaCodigo, mecCodmer);
    }

}