package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PPTF_TIPOFUERA")
public class PptfTipofuera {
    @Id
    @Column(name = "PTF_CODIGO", nullable = false)
    private Long id;

    @Size(max = 50)
    @Column(name = "PTF_DESCRI", length = 50)
    private String ptfDescri;

    @Column(name = "PTF_ESTADO")
    private Boolean ptfEstado;

    @Column(name = "PTF_FECHA")
    private LocalDate ptfFecha;

}