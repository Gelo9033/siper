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
@Table(name = "MESP_ESPEC")
public class MespEspec {
    @Id
    @Size(max = 8)
    @Column(name = "ESP_CODIGO", nullable = false, length = 8)
    private String espCodigo;

    @Size(max = 40)
    @NotNull
    @Column(name = "ESP_DESCRI", nullable = false, length = 40)
    private String espDescri;

    @Size(max = 8)
    @Column(name = "ESP_ABREV", length = 8)
    private String espAbrev;

    @Column(name = "ESP_ESTADO")
    private Boolean espEstado;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "MES_ESP_CODIGO")
    private MespEspec mesEspCodigo;

}