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
@Table(name = "PLAN_L_ANU")
public class PlanLAnu {
    @EmbeddedId
    private PlanLAnuId id;

    @Size(max = 15)
    @Column(name = "ORG_NUMERO", length = 15)
    private String orgNumero;

    @NotNull
    @Column(name = "PAI_CODPAI", nullable = false)
    private Short paiCodpai;

    @NotNull
    @Column(name = "CIU_CODIGO", nullable = false)
    private Long ciuCodigo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "LAN_TIPOSOL", referencedColumnName = "LAN_TIPOSOL", nullable = false),
            @JoinColumn(name = "CLP_CODIGO", referencedColumnName = "CLP_CODIGO", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PclpCauslicper pclpCauslicper;

    @NotNull
    @Column(name = "LAN_FECFIN", nullable = false)
    private LocalDate lanFecfin;

    @Column(name = "LAN_FECPRES")
    private LocalDate lanFecpres;

    @Column(name = "LAN_SUELDO")
    private Boolean lanSueldo;

    @Size(max = 250)
    @Column(name = "LAN_DIREC", length = 250)
    private String lanDirec;

    @Size(max = 15)
    @Column(name = "LAN_TELEFO", length = 15)
    private String lanTelefo;

    @NotNull
    @Column(name = "LAN_ESTADO", nullable = false)
    private Boolean lanEstado = false;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA_REG", nullable = false, length = 15)
    private String memCedulaReg;

    @Column(name = "LAN_FECHA_REG")
    private LocalDate lanFechaReg;

    @Column(name = "LAN_DIADESC")
    private Short lanDiadesc;

    @Column(name = "LAN_MAXDIA")
    private Integer lanMaxdia;

    @Size(max = 250)
    @Column(name = "LAN_OBSERVA", length = 250)
    private String lanObserva;

    @Column(name = "LAN_FECAUX")
    private LocalDate lanFecaux;

    @Size(max = 1)
    @Column(name = "LAN_APROBA", length = 1)
    private String lanAproba;

    @Size(max = 15)
    @Column(name = "MEM_CEDULA_APRO", length = 15)
    private String memCedulaApro;

    @Column(name = "LAN_FECHA_APRO")
    private LocalDate lanFechaApro;

    @Size(max = 250)
    @Column(name = "LAN_OBSERVAUX", length = 250)
    private String lanObservaux;

}