package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PTCO_TIPCONTA")
public class PtcoTipconta {
    @Id
    @Column(name = "TCO_CODIGO", nullable = false)
    private Integer id;

    @Size(max = 30)
    @Column(name = "TCO_DESCRI", length = 30)
    private String tcoDescri;

}