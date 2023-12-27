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
@Table(name = "MAFU_AFUNC")
public class MafuAfunc {
    @Id
    @Size(max = 8)
    @Column(name = "AFU_CODIGO", nullable = false, length = 8)
    private String afuCodigo;

    @Size(max = 60)
    @NotNull
    @Column(name = "AFU_DESCRI", nullable = false, length = 60)
    private String afuDescri;

    @NotNull
    @Column(name = "AFU_ABREVI", nullable = false)
    private Boolean afuAbrevi = false;

    @Column(name = "AFU_ESTADO")
    private Boolean afuEstado;

}