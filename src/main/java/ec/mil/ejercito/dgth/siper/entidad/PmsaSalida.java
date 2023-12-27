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
@Table(name = "PMSA_SALIDA")
public class PmsaSalida {
    @Id
    @Column(name = "MSA_NUMERO", nullable = false)
    private Short id;

    @Size(max = 100)
    @NotNull
    @Column(name = "MSA_DESCRIP", nullable = false, length = 100)
    private String msaDescrip;

}