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
@Table(name = "PSTI_SELECTIT")
public class PstiSelectit {
    @Id
    @Size(max = 15)
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @NotNull
    @Column(name = "TIT_CODIGO", nullable = false)
    private Short titCodigo;

}