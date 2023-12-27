package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "PMEC_MERCLA")
public class PmecMercla {
    @EmbeddedId
    private PmecMerclaId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "PME_MEC_M_D", referencedColumnName = "MEC_M_D"),
            @JoinColumn(name = "PME_MEC_CODMER", referencedColumnName = "MEC_CODMER")
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private PmecMercla pmecMercla;

    @Size(max = 15)
    @NotNull
    @Column(name = "CCU_CODIGO", nullable = false, length = 15)
    private String ccuCodigo;

    @Size(max = 104)
    @Column(name = "MEC_DESMER", length = 104)
    private String mecDesmer;

    @Column(name = "MEC_CONDECORACION")
    private Boolean mecCondecoracion;

    @Column(name = "MEC_NIVEL")
    private Boolean mecNivel;

    @Column(name = "MEC_LEVEL")
    private Short mecLevel;

    @Size(max = 15)
    @Column(name = "MEC_ANCESTRO_RAIZ", length = 15)
    private String mecAncestroRaiz;

    @NotNull
    @Column(name = "MEC_REMUNERADO", nullable = false)
    private Boolean mecRemunerado = false;

    @Column(name = "MEC_PROCESO")
    private Boolean mecProceso;

    @Column(name = "MEC_CONDEC")
    private Boolean mecCondec;

    @Size(max = 5)
    @NotNull
    @Column(name = "CSE_CLACOD", nullable = false, length = 5)
    private String cseClacod;

    @NotNull
    @Column(name = "TEF_CODIGO", nullable = false)
    private Short tefCodigo;

}