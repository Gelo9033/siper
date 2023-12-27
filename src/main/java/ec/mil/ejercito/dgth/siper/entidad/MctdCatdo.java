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
@Table(name = "MCTD_CATDO")
public class MctdCatdo {
    @Id
    @Size(max = 8)
    @Column(name = "CTD_CODIGO", nullable = false, length = 8)
    private String ctdCodigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "MCT_CTD_CODIGO")
    private MctdCatdo mctCtdCodigo;

    @Size(max = 200)
    @NotNull
    @Column(name = "CTD_DESCRI", nullable = false, length = 200)
    private String ctdDescri;

}