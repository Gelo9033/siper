package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "PASC_ASCPARAM")
public class PascAscparam {
    @EmbeddedId
    private PascAscparamId id;

    @MapsId("ascCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "ASC_CODIGO", nullable = false)
    private PlscLascpr ascCodigo;

    @MapsId("afuCodigo")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "AFU_CODIGO", nullable = false)
    private MafuAfunc afuCodigo;

    @Size(max = 500)
    @NotNull
    @Column(name = "ASC_DESCRIPCION", nullable = false, length = 500)
    private String ascDescripcion;

    @Column(name = "ASC_VALOR", precision = 6, scale = 3)
    private BigDecimal ascValor;

    @Size(max = 10)
    @Column(name = "ASC_VALORC", length = 10)
    private String ascValorc;

    @Column(name = "ASC_TIPO")
    private Boolean ascTipo;

}