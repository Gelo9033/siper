package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PDDI_DIADIS")
public class PddiDiadi {
    @EmbeddedId
    private PddiDiadiId id;

    @Size(max = 5)
    @NotNull
    @Column(name = "CSE_CLACOD", nullable = false, length = 5)
    private String cseClacod;

    @NotNull
    @Column(name = "DDI_NUMDIA", nullable = false)
    private Short ddiNumdia;

    @NotNull
    @Column(name = "DDI_DIAANIO", nullable = false)
    private Short ddiDiaanio;

    @Column(name = "DDI_NOR_SS")
    private Boolean ddiNorSs;

    @Column(name = "DDI_NOR_CS")
    private Boolean ddiNorCs;

    @Column(name = "DDI_NUMDIA_SOBREPASO")
    private Short ddiNumdiaSobrepaso;

}