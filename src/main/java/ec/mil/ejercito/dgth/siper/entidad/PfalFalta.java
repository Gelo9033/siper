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
@Table(name = "PFAL_FALTA")
public class PfalFalta {
    @EmbeddedId
    private PfalFaltaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "MEC_M_D", referencedColumnName = "MEC_M_D"),
            @JoinColumn(name = "MEC_CODMER", referencedColumnName = "MEC_CODMER")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PmecMercla pmecMercla;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "REG_CODIGOR", referencedColumnName = "REG_CODIGOR", nullable = false),
            @JoinColumn(name = "ART_ANIO", referencedColumnName = "ART_ANIO", nullable = false),
            @JoinColumn(name = "ART_LEY", referencedColumnName = "ART_LEY", nullable = false),
            @JoinColumn(name = "LIT_LITER", referencedColumnName = "LIT_LITER", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PlitLitera plitLitera;

    @NotNull
    @Column(name = "GMI_CODIGO", nullable = false)
    private Short gmiCodigo;

    @Size(max = 15)
    @Column(name = "ORG_NUMERO", length = 15)
    private String orgNumero;

    @Column(name = "FAL_NUMERO", precision = 4, scale = 2)
    private BigDecimal falNumero;

    @Column(name = "FAL_PORCENT", precision = 6, scale = 2)
    private BigDecimal falPorcent;

    @Column(name = "FAL_DIADESC", precision = 4, scale = 2)
    private BigDecimal falDiadesc;

    @Size(max = 100)
    @Column(name = "FAL_NOMBRE", length = 100)
    private String falNombre;

    @Size(max = 100)
    @Column(name = "FAL_OBSER", length = 100)
    private String falObser;

    @Size(max = 100)
    @Column(name = "FAL_REFERENCIA", length = 100)
    private String falReferencia;

    @Column(name = "FAL_ESTADO")
    private Boolean falEstado;

    @Column(name = "FAL_FECPRO")
    private LocalDate falFecpro;

    @Column(name = "TFA_CODIGO")
    private Boolean tfaCodigo;

    @Size(max = 100)
    @Column(name = "PERSONA_SANCIONA", length = 100)
    private String personaSanciona;

    @Column(name = "FAL_REGISTRO")
    private Long falRegistro;

    @Size(max = 15)
    @Column(name = "PME_MEM_CEDULA", length = 15)
    private String pmeMemCedula;

    @Size(max = 15)
    @Column(name = "FAL_MEM_CEDULA", length = 15)
    private String falMemCedula;

    @Column(name = "FAL_FEC_FALTA")
    private LocalDate falFecFalta;

    @Column(name = "FAL_ANIOALUM", precision = 4, scale = 2)
    private BigDecimal falAnioalum;

    @Size(max = 100)
    @Column(name = "FAL_OBSERANULA", length = 100)
    private String falObseranula;

}