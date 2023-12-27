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
@Table(name = "MGRU_GRUPO")
public class MgruGrupo {
    @EmbeddedId
    private MgruGrupoId id;

    @MapsId("socCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "SOC_CODIGO", nullable = false)
    private MsocSrvocu socCodigo;

    @Size(max = 60)
    @Column(name = "GRU_DESCRI", length = 60)
    private String gruDescri;

}