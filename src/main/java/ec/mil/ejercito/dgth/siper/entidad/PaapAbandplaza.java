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
@Table(name = "PAAP_ABANDPLAZA")
public class PaapAbandplaza {
    @Id
    @Column(name = "AAP_CODIGO", nullable = false)
    private Integer id;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Column(name = "AAP_FECHAINI")
    private LocalDate aapFechaini;

    @Column(name = "AAP_FECHAFIN")
    private LocalDate aapFechafin;

    @Size(max = 100)
    @Column(name = "AAP_OBSERVA", length = 100)
    private String aapObserva;

    @Size(max = 1)
    @Column(name = "AAP_ESTADO", length = 1)
    private String aapEstado;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

    @Size(max = 2)
    @NotNull
    @Column(name = "PRV_CODIGO", nullable = false, length = 2)
    private String prvCodigo;

    @Size(max = 5)
    @Column(name = "AAP_MOTIVO", length = 5)
    private String aapMotivo;

    @Size(max = 15)
    @NotNull
    @Column(name = "AAP_CEDULAREG", nullable = false, length = 15)
    private String aapCedulareg;

    @Column(name = "AAP_FECHAREG")
    private LocalDate aapFechareg;

    @Size(max = 15)
    @Column(name = "AAP_CELULAR", length = 15)
    private String aapCelular;

}