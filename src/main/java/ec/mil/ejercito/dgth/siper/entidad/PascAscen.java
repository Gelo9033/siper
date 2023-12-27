package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PASC_ASCEN")
public class PascAscen {
    @EmbeddedId
    private PascAscenId id;

    @Size(max = 15)
    @NotNull
    @Column(name = "ORG_NUMERO", nullable = false, length = 15)
    private String orgNumero;

    @NotNull
    @Column(name = "ASC_FECHA", nullable = false)
    private LocalDate ascFecha;

    @NotNull
    @Column(name = "ASC_NOTA", nullable = false, precision = 6, scale = 4)
    private BigDecimal ascNota;

    @Size(max = 30)
    @Column(name = "ASC_MOTIVO", length = 30)
    private String ascMotivo;

    @Column(name = "ASC_PAGADO")
    private Boolean ascPagado;

    @Column(name = "ASC_PROMER", precision = 6, scale = 3)
    private BigDecimal ascPromer;

    @Column(name = "ASC_PRODEM", precision = 6, scale = 3)
    private BigDecimal ascProdem;

    @Column(name = "ASC_CAMEDE", precision = 6, scale = 3)
    private BigDecimal ascCamede;

    @Column(name = "ASC_FECPRO")
    private LocalDate ascFecpro;

    @Column(name = "ASC_PAGRETRO")
    private Boolean ascPagretro;

    @Column(name = "ASC_ESTRETRO")
    private Boolean ascEstretro;

    @Column(name = "ASC_FECHAEFEC")
    private LocalDate ascFechaefec;

    @Column(name = "ASC_FECRETRO")
    private LocalDate ascFecretro;

    @Column(name = "ASC_REVERSION")
    private Boolean ascReversion;

    @Column(name = "ASC_FPROCESO")
    private LocalDate ascFproceso;

}