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
@Table(name = "PCEM_CAR_E")
public class PcemCarE {
    @EmbeddedId
    private PcemCarEId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "PUE_CODIGO2", referencedColumnName = "PUE_CODIGO2", nullable = false),
            @JoinColumn(name = "PUN_CLASEC", referencedColumnName = "PUN_CLASEC", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MporPuorg mporPuorg;

    @Size(max = 15)
    @NotNull
    @Column(name = "PME_MEM_CEDULA", nullable = false, length = 15)
    private String pmeMemCedula;

    @NotNull
    @Column(name = "TCN_CODIGO", nullable = false)
    private Short tcnCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "MPO_PUE_CODIGO2", referencedColumnName = "PUE_CODIGO2"),
            @JoinColumn(name = "MPO_PUN_CLASEC", referencedColumnName = "PUN_CLASEC")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MporPuorg mporPuorg1;

    @Column(name = "FUN_FECFIN")
    private LocalDate funFecfin;

    @Column(name = "FUN_FECPRE")
    private LocalDate funFecpre;

    @Column(name = "FUN_FECMER")
    private LocalDate funFecmer;

    @Column(name = "FUN_ESTADO")
    private Boolean funEstado;

    @Size(max = 150)
    @Column(name = "FUN_DOCREF", length = 150)
    private String funDocref;

    @Column(name = "FUN_FECHA_REG")
    private LocalDate funFechaReg;

    @Size(max = 1)
    @Column(name = "FUN_CARGO", length = 1)
    private String funCargo;

}