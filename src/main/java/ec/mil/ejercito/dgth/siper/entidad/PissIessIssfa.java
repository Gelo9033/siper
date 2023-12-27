package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PISS_IESS_ISSFA")
public class PissIessIssfa {
    @EmbeddedId
    private PissIessIssfaId id;

    @Column(name = "IES_INSTITUTO")
    private Boolean iesInstituto;

}