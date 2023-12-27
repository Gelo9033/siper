package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PCDA_CONFDATO")
public class PcdaConfdato {
    @Id
    @Column(name = "CDA_CODIGO", nullable = false)
    private Integer id;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Column(name = "CDA_FECHA")
    private LocalDate cdaFecha;

    @Size(max = 1)
    @Column(name = "CDA_CONFORME", length = 1)
    private String cdaConforme;

    @Size(max = 4000)
    @Column(name = "CDA_OBSERVACION", length = 4000)
    private String cdaObservacion;

}