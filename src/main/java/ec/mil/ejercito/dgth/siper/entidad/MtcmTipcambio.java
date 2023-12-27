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
@Table(name = "MTCM_TIPCAMBIO")
public class MtcmTipcambio {
    @Id
    @Size(max = 8)
    @Column(name = "TCM_CODIGO", nullable = false, length = 8)
    private String tcmCodigo;

    @Size(max = 60)
    @Column(name = "TCM_DESCRIP", length = 60)
    private String tcmDescrip;

}