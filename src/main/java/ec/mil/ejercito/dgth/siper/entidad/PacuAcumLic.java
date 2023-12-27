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
@Table(name = "PACU_ACUM_LIC")
public class PacuAcumLic {
    @Id
    @Column(name = "ACU_CODIGO", nullable = false)
    private Integer id;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Column(name = "ACU_DIAS_ACUM")
    private Long acuDiasAcum;

    @Column(name = "ACU_ANIO")
    private Long acuAnio;

    @Size(max = 100)
    @Column(name = "ACU_DESCRI", length = 100)
    private String acuDescri;

    @Size(max = 100)
    @Column(name = "ACU_OBSERVA", length = 100)
    private String acuObserva;

    @Size(max = 100)
    @Column(name = "ACU_DOCUMENTO", length = 100)
    private String acuDocumento;

    @Size(max = 1)
    @Column(name = "ACU_ESTADO", length = 1)
    private String acuEstado;

    @Size(max = 15)
    @Column(name = "MEM_CEDULAREG", length = 15)
    private String memCedulareg;

    @Column(name = "ACU_FECHAREG")
    private LocalDate acuFechareg;

}