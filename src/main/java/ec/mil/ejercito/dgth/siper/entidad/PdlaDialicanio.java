package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "PDLA_DIALICANIO")
public class PdlaDialicanio {
    @EmbeddedId
    private PdlaDialicanioId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "MEM_CEDULA", referencedColumnName = "MEM_CEDULA", nullable = false),
            @JoinColumn(name = "LAN_FECINI", referencedColumnName = "LAN_FECINI", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PlanLAnu planLAnu;

    @NotNull
    @Column(name = "DLA_NUMDIA", nullable = false)
    private Long dlaNumdia;

}