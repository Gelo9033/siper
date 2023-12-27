package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PCTO_CONTACTO")
public class PctoContacto {
    @Id
    @Column(name = "CTO_CODIGO", nullable = false)
    private Long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "TCO_CODIGO", nullable = false)
    private PtcoTipconta tcoCodigo;

    @Size(max = 15)
    @NotNull
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Size(max = 50)
    @Column(name = "CTO_CONTAC", length = 50)
    private String ctoContac;

    @Column(name = "CTO_FECHA")
    private LocalDate ctoFecha;

    @Size(max = 10)
    @Column(name = "CTO_TELEFON", length = 10)
    private String ctoTelefon;

    @Size(max = 10)
    @Column(name = "CTO_CELULAR", length = 10)
    private String ctoCelular;

}