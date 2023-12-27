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
@Table(name = "MTPU_PUESTOS")
public class MtpuPuesto {
    @Id
    @Size(max = 8)
    @Column(name = "TPU_CODIGO", nullable = false, length = 8)
    private String tpuCodigo;

    @Size(max = 60)
    @Column(name = "TPU_DESCRI", length = 60)
    private String tpuDescri;

}