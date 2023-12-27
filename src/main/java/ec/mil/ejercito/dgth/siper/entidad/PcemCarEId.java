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
public class PcemCarEId implements Serializable {
    private static final long serialVersionUID = -1452064012477569486L;
    @Size(max = 9)
    @NotNull
    @Column(name = "PUE_CODIGO2", nullable = false, length = 9)
    private String pueCodigo2;

    @NotNull
    @Column(name = "PUN_CLASEC", nullable = false)
    private Long punClasec;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "FUN_FECINI", nullable = false)
    private LocalDate funFecini;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PcemCarEId entity = (PcemCarEId) o;
        return Objects.equals(this.funFecini, entity.funFecini) &&
                Objects.equals(this.pueCodigo2, entity.pueCodigo2) &&
                Objects.equals(this.punClasec, entity.punClasec) &&
                Objects.equals(this.memCedula, entity.memCedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funFecini, pueCodigo2, punClasec, memCedula);
    }

}