package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "MGFU_GFUNC")
public class MgfuGfunc {
    @EmbeddedId
    private MgfuGfuncId id;

    @MapsId("afuCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "AFU_CODIGO", nullable = false)
    private MafuAfunc afuCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TGRF_CODIGO")
    private MtgfTgrupof tgrfCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "MGF_AFU_CODIGO", referencedColumnName = "AFU_CODIGO"),
            @JoinColumn(name = "MGF_GFU_CODIGO", referencedColumnName = "GFU_CODIGO")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MgfuGfunc mgfuGfunc;

    @Size(max = 35)
    @NotNull
    @Column(name = "GFU_DESCRI", nullable = false, length = 35)
    private String gfuDescri;

    @Size(max = 8)
    @NotNull
    @Column(name = "GFU_ABREVI", nullable = false, length = 8)
    private String gfuAbrevi;

    @Column(name = "GFU_ESTADO")
    private Boolean gfuEstado;

}