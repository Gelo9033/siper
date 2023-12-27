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
@Table(name = "PREG_REGLAM")
public class PregReglam {
    @Id
    @Column(name = "REG_CODIGOR", nullable = false)
    private Short id;

    @Size(max = 500)
    @NotNull
    @Column(name = "REG_DESCRI", nullable = false, length = 500)
    private String regDescri;

}