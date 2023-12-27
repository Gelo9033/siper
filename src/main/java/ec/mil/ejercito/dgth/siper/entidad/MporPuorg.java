package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "MPOR_PUORG")
public class MporPuorg {
    @EmbeddedId
    private MporPuorgId id;

    @MapsId("pueCodigo2")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PUE_CODIGO2", nullable = false)
    private MpuePuest pueCodigo2;

    @NotNull
    @Column(name = "GMI_CODIGO", nullable = false)
    private Short gmiCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "ESP_CODIGO", nullable = false)
    private MespEspec espCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "AFU_CODIGO", referencedColumnName = "AFU_CODIGO", nullable = false),
            @JoinColumn(name = "GFU_CODIGO", referencedColumnName = "GFU_CODIGO", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MgfuGfunc mgfuGfunc;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "CTD_CODIGO", nullable = false)
    private MctdCatdo ctdCodigo;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

    @NotNull
    @Column(name = "PGM_GMI_CODIGO", nullable = false)
    private Short pgmGmiCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TCM_CODIGO", nullable = false)
    private MtcmTipcambio tcmCodigo;

    @Size(max = 25)
    @NotNull
    @Column(name = "MUN_UNI_CODIGO2", nullable = false, length = 25)
    private String munUniCodigo2;

    @Size(max = 300)
    @Column(name = "PUN_OBSER", length = 300)
    private String punObser;

    @Size(max = 2)
    @Column(name = "PUN_CONTR", length = 2)
    private String punContr;

    @Column(name = "PUN_ESTADO")
    private Boolean punEstado;

    @Column(name = "PUN_FECCRE")
    private LocalDate punFeccre;

    @NotNull
    @Column(name = "PUN_CANTID", nullable = false)
    private Short punCantid;

    @Column(name = "PUN_VACPUE")
    private Short punVacpue;

    @Column(name = "PUN_VACPAS")
    private Short punVacpas;

}