package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "PART_ARLEY")
public class PartArley {
    @EmbeddedId
    private PartArleyId id;

    @MapsId("regCodigor")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "REG_CODIGOR", nullable = false)
    private PregReglam regCodigor;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TFA_CODIGO")
    private PtfaFalta tfaCodigo;

    @Size(max = 10)
    @NotNull
    @Column(name = "ART_ARTICULO", nullable = false, length = 10)
    private String artArticulo;

    @Size(max = 1500)
    @NotNull
    @Column(name = "ART_DESART", nullable = false, length = 1500)
    private String artDesart;

    @Column(name = "ART_VIGENTE")
    private Boolean artVigente;

}