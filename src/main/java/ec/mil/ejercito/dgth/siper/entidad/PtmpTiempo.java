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
@Table(name = "PTMP_TIEMPO")
public class PtmpTiempo {
    @Id
    @Size(max = 5)
    @Column(name = "TMP_CODIGO", nullable = false, length = 5)
    private String tmpCodigo;

    @Size(max = 100)
    @Column(name = "TMP_DESCRIP", length = 100)
    private String tmpDescrip;

}