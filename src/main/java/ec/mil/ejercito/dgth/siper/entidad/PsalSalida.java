package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PSAL_SALIDA")
public class gitPsalSalida {
    @EmbeddedId
    private PsalSalidaId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "MEM_CEDULA", referencedColumnName = "MEM_CEDULA", nullable = false),
            @JoinColumn(name = "LAN_FECINI", referencedColumnName = "LAN_FECINI", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PlanLAnu planLAnu;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "MSA_NUMERO", nullable = false)
    private PmsaSalida msaNumero;

    @Column(name = "SAL_FECING")
    private LocalDate salFecing;

}