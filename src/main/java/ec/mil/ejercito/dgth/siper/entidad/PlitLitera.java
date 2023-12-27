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
@Table(name = "PLIT_LITERA")
public class PlitLitera {
    @EmbeddedId
    private PlitLiteraId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "REG_CODIGOR", referencedColumnName = "REG_CODIGOR", nullable = false),
            @JoinColumn(name = "ART_ANIO", referencedColumnName = "ART_ANIO", nullable = false),
            @JoinColumn(name = "ART_LEY", referencedColumnName = "ART_LEY", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PartArley partArley;

    @Size(max = 3)
    @NotNull
    @Column(name = "LIT_LITERAL", nullable = false, length = 3)
    private String litLiteral;

    @Size(max = 700)
    @NotNull
    @Column(name = "LIT_DESCRI", nullable = false, length = 700)
    private String litDescri;

    @Column(name = "LIT_VIGENTE")
    private Boolean litVigente;

}