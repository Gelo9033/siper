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
@Table(name = "PCAA_CAMBAR")
public class PcaaCambar {
    @EmbeddedId
    private PcaaCambarId id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "AFU_CODIGO", referencedColumnName = "AFU_CODIGO", nullable = false),
            @JoinColumn(name = "GFU_CODIGO", referencedColumnName = "GFU_CODIGO", nullable = false)
    })
    @OnDelete(action = OnDeleteAction.RESTRICT)
    private MgfuGfunc mgfuGfunc;

    @Size(max = 15)
    @Column(name = "ORG_NUMERO", length = 15)
    private String orgNumero;

    @NotNull
    @Column(name = "CAA_TIPO", nullable = false)
    private Boolean caaTipo = false;

    @Size(max = 100)
    @Column(name = "CAA_DESC", length = 100)
    private String caaDesc;

    @Column(name = "CAA_INSUB")
    private Boolean caaInsub;

    @Column(name = "CAA_INDFU")
    private Boolean caaIndfu;

    @Column(name = "CAA_IDCAR")
    private Boolean caaIdcar;

    @Size(max = 10)
    @Column(name = "CAA_SUBSISTEMA", length = 10)
    private String caaSubsistema;

    @Size(max = 8)
    @Column(name = "ESP_CODIGO", length = 8)
    private String espCodigo;

}