package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "MSRI_SERIE")
public class MsriSerie {
    @EmbeddedId
    private MsriSerieId id;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "SOC_CODIGO", referencedColumnName = "SOC_CODIGO", nullable = false),
            @JoinColumn(name = "GRU_CODIGO", referencedColumnName = "GRU_CODIGO", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MgruGrupo mgruGrupo;

    @Size(max = 60)
    @Column(name = "SRI_DESCRI", length = 60)
    private String sriDescri;

}