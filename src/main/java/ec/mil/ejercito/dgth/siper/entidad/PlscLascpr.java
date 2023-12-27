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
@Table(name = "PLSC_LASCPR")
public class PlscLascpr {
    @Id
    @Column(name = "ASC_CODIGO", nullable = false)
    private Integer id;

    @Size(max = 60)
    @Column(name = "ASC_NOMBRE", length = 60)
    private String ascNombre;

}