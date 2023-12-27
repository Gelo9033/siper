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
@Table(name = "PPCU_CATALUNIDA")
public class PpcuCatalunida {
    @Id
    @Column(name = "PCU_CODIGO", nullable = false)
    private Long id;

    @Size(max = 50)
    @Column(name = "PCU_DESCRIPCION", length = 50)
    private String pcuDescripcion;

    @Size(max = 15)
    @Column(name = "PCU_SIGLAS", length = 15)
    private String pcuSiglas;

    @Column(name = "PCU_FECCREA")
    private LocalDate pcuFeccrea;

    @Column(name = "PCU_ESTADO")
    private Boolean pcuEstado;

    @Column(name = "PCU_FECFIN")
    private LocalDate pcuFecfin;

    @Column(name = "PCU_TIPOSUBUNID")
    private Long pcuTiposubunid;

}