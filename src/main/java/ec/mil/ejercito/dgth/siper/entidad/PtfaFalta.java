package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PTFA_FALTA")
public class PtfaFalta {
    @Id
    @Column(name = "TFA_CODIGO", nullable = false)
    private Boolean id = false;

    @Size(max = 60)
    @NotNull
    @Column(name = "TFA_DESCRIP", nullable = false, length = 60)
    private String tfaDescrip;

}