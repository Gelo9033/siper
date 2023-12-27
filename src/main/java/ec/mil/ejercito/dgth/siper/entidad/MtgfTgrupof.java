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
@Table(name = "MTGF_TGRUPOF")
public class MtgfTgrupof {
    @Id
    @Size(max = 8)
    @Column(name = "TGRF_CODIGO", nullable = false, length = 8)
    private String tgrfCodigo;

    @Size(max = 60)
    @Column(name = "TGRF_DESCRIPCION", length = 60)
    private String tgrfDescripcion;

}