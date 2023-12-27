package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "PSAN_SANCION")
public class PsanSancion {
    @EmbeddedId
    private PsanSancionId id;

    @MapsId("tfaCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TFA_CODIGO", nullable = false)
    private PtfaFalta tfaCodigo;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "MEC_M_D", referencedColumnName = "MEC_M_D", nullable = false),
            @JoinColumn(name = "MEC_CODMER", referencedColumnName = "MEC_CODMER", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PmecMercla pmecMercla;

    @Column(name = "SAN_MINIMA")
    private Short sanMinima;

    @Column(name = "SAN_MAXIMA")
    private Short sanMaxima;

    @Column(name = "SAN_DEMERITO")
    private Long sanDemerito;

    @Column(name = "REG_CODIGOR")
    private Long regCodigor;

}