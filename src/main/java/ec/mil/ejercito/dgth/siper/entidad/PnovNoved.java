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
@Table(name = "PNOV_NOVED")
public class PnovNoved {
    @Id
    @Column(name = "NOV_CODIGO", nullable = false)
    private Long id;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "NOV_FECINI", nullable = false)
    private LocalDate novFecini;

    @Size(max = 300)
    @NotNull
    @Column(name = "NOV_OBSERV", nullable = false, length = 300)
    private String novObserv;

    @Size(max = 40)
    @Column(name = "NOV_UNIDAD", length = 40)
    private String novUnidad;

    @Column(name = "NOV_FECFIN")
    private LocalDate novFecfin;

    @Column(name = "NOV_FECPRE")
    private LocalDate novFecpre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "CLP_CODIGO", referencedColumnName = "LAN_TIPOSOL"),
            @JoinColumn(name = "LAN_TIPOSOL", referencedColumnName = "CLP_CODIGO")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PclpCauslicper pclpCauslicper;

    @Column(name = "NOV_PADRE")
    private Long novPadre;

    @Size(max = 100)
    @Column(name = "NOV_DOCUMENTO", length = 100)
    private String novDocumento;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA_REG", nullable = false, length = 15)
    private String memCedulaReg;

    @Column(name = "NOV_FECHA_REG")
    private LocalDate novFechaReg;

}