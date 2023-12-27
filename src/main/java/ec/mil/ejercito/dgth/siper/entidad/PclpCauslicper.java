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
@Table(name = "PCLP_CAUSLICPER")
public class PclpCauslicper {
    @EmbeddedId
    private PclpCauslicperId id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TMP_CODIGO", nullable = false)
    private PtmpTiempo tmpCodigo;

    @Size(max = 100)
    @Column(name = "CLP_DESCRIP", length = 100)
    private String clpDescrip;

    @Column(name = "CLP_MAXIMO")
    private Short clpMaximo;

    @Size(max = 300)
    @Column(name = "CLP_AUTORIZA", length = 300)
    private String clpAutoriza;

    @Column(name = "CLP_SUELDO")
    private Boolean clpSueldo;

    @Column(name = "CLP_IMPUTABLE")
    private Boolean clpImputable;

    @Column(name = "CLP_CLASEF")
    private Boolean clpClasef;

    @Column(name = "CLP_ORDENGENERAL")
    private Boolean clpOrdengeneral;

    @Column(name = "CLP_SIGNO")
    private Boolean clpSigno;

    @Column(name = "CLP_ESTADO")
    private Boolean clpEstado;

    @Size(max = 4)
    @Column(name = "CLP_ORD", length = 4)
    private String clpOrd;

    @Size(max = 2)
    @Column(name = "CLP_PARTMENS", length = 2)
    private String clpPartmens;

}