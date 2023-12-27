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
@Table(name = "MSOC_SRVOCU")
public class MsocSrvocu {
    @Id
    @Size(max = 5)
    @Column(name = "SOC_CODIGO", nullable = false, length = 5)
    private String socCodigo;

    @Size(max = 60)
    @Column(name = "SOC_DESCRI", length = 60)
    private String socDescri;

}