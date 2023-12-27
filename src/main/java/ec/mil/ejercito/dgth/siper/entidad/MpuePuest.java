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
@Table(name = "MPUE_PUEST")
public class MpuePuest {
    @Id
    @Size(max = 9)
    @Column(name = "PUE_CODIGO2", nullable = false, length = 9)
    private String pueCodigo2;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TPU_CODIGO", nullable = false)
    private MtpuPuesto tpuCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "NIV_CODIGO")
    private PnivNivel nivCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "SOC_CODIGO", referencedColumnName = "SOC_CODIGO"),
            @JoinColumn(name = "GRU_CODIGO", referencedColumnName = "GRU_CODIGO"),
            @JoinColumn(name = "SRI_CODIGO", referencedColumnName = "SRI_CODIGO")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MsriSerie msriSerie;

    @Size(max = 70)
    @NotNull
    @Column(name = "PUE_DESCRI2", nullable = false, length = 70)
    private String pueDescri2;

    @Size(max = 300)
    @NotNull
    @Column(name = "PUE_NATUR", nullable = false, length = 300)
    private String pueNatur;

    @Column(name = "PUE_ESTADO")
    private Boolean pueEstado;

    @Column(name = "PUE_FECHA")
    private LocalDate pueFecha;

}