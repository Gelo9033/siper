package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PPFU_FUERAFILA")
public class PpfuFuerafila {
    @Id
    @Column(name = "PFU_CODIGO", nullable = false)
    private Long id;

    @Size(max = 100)
    @Column(name = "PFU_OBSERVACION", length = 100)
    private String pfuObservacion;

    @Column(name = "PFU_ESTADO")
    private Boolean pfuEstado;

    @Column(name = "PFU_FECHAINI")
    private LocalDate pfuFechaini;

    @Column(name = "PFU_FECHAFIN")
    private LocalDate pfuFechafin;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PTF_CODIGO")
    private PptfTipofuera ptfCodigo;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Size(max = 15)
    @NotNull
    @Column(name = "REG_CEDULA", nullable = false, length = 15)
    private String regCedula;

    @Column(name = "PFU_FECHAREG")
    private LocalDate pfuFechareg;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

}