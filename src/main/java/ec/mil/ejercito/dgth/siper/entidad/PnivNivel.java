package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PNIV_NIVEL")
public class PnivNivel {
    @Id
    @Column(name = "NIV_CODIGO", nullable = false)
    private Short id;

    @Size(max = 40)
    @NotNull
    @Column(name = "NIV_DESCRI", nullable = false, length = 40)
    private String nivDescri;

}