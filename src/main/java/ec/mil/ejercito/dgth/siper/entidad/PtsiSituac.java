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
@Table(name = "PTSI_SITUAC")
public class PtsiSituac {
    @Id
    @Column(name = "TSI_CODIGO", nullable = false)
    private Short id;

    @Size(max = 255)
    @NotNull
    @Column(name = "TSI_DESCRI", nullable = false)
    private String tsiDescri;

}