package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PMDC_MDXCIU")
public class PmdcMdxciu {
    @EmbeddedId
    private PmdcMdxciuId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "MEC_M_D", referencedColumnName = "MEC_M_D", nullable = false),
            @JoinColumn(name = "MEC_CODMER", referencedColumnName = "MEC_CODMER", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PmecMercla pmecMercla;

    @NotNull
    @Column(name = "PAI_CODPAI", nullable = false)
    private Short paiCodpai;

    @Size(max = 15)
    @Column(name = "ORG_NUMERO", length = 15)
    private String orgNumero;

    @Size(max = 15)
    @NotNull
    @Column(name = "PME_MEM_CEDULA", nullable = false, length = 15)
    private String pmeMemCedula;

    @Column(name = "MDC_FECHA")
    private LocalDate mdcFecha;

    @Column(name = "MDC_PAGADO")
    private Boolean mdcPagado;

    @Column(name = "MDC_VALOR_MD", precision = 6, scale = 3)
    private BigDecimal mdcValorMd;

    @Column(name = "MDC_NRO_HORAS")
    private Long mdcNroHoras;

    @Column(name = "MDC_CALIFICACION", precision = 6, scale = 3)
    private BigDecimal mdcCalificacion;

    @Column(name = "MDC_PROC_ASC")
    private Boolean mdcProcAsc;

    @Size(max = 300)
    @Column(name = "MDC_REFERENCIA", length = 300)
    private String mdcReferencia;

    @Column(name = "MDC_NOCONTA")
    private Boolean mdcNoconta;

    @Column(name = "MDC_PAGMER")
    private LocalDate mdcPagmer;

    @Column(name = "MDC_CONDECORACION")
    private Boolean mdcCondecoracion;

    @Column(name = "MDC_FECHA_CUMPLIMIENTO")
    private LocalDate mdcFechaCumplimiento;

    @Column(name = "MDC_TITULAR")
    private Boolean mdcTitular;

    @Column(name = "MDC_PROCES")
    private Boolean mdcProces;

    @Column(name = "MDC_FECHA_CARGA")
    private LocalDate mdcFechaCarga;

    @Column(name = "MDC_ESTADO")
    private Boolean mdcEstado;

    @Size(max = 100)
    @Column(name = "FAL_OBSERANULA", length = 100)
    private String falObseranula;

}