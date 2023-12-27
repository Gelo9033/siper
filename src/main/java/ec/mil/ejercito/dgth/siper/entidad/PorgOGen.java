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
@Table(name = "PORG_O_GEN")
public class PorgOGen {
    @EmbeddedId
    private PorgOGenId id;

    @MapsId("togCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TOG_CODIGO", nullable = false)
    private PtogTipog togCodigo;

    @NotNull
    @Column(name = "ORG_FECHA", nullable = false)
    private LocalDate orgFecha;

    @Size(max = 3000)
    @NotNull
    @Column(name = "ORG_RESUME", nullable = false, length = 3000)
    private String orgResume;

}