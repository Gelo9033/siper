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
@Table(name = "PPSU_SUBUNIDAD")
public class PpsuSubunidad {
    @Id
    @Column(name = "PSU_CODIGO", nullable = false)
    private Long id;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Size(max = 25)
    @NotNull
    @Column(name = "UNI_CODIGO2", nullable = false, length = 25)
    private String uniCodigo2;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "PCU_CODIGO", nullable = false)
    private PpcuCatalunida pcuCodigo;

    @Size(max = 15)
    @Column(name = "CEDULA_REG", length = 15)
    private String cedulaReg;

    @Column(name = "PSU_FECCREA")
    private LocalDate psuFeccrea;

    @Column(name = "PSU_ESTADO")
    private Boolean psuEstado;

    @Column(name = "PSU_FECFIN")
    private LocalDate psuFecfin;

    @Column(name = "PSU_SUBDIVISION")
    private Boolean psuSubdivision;

}