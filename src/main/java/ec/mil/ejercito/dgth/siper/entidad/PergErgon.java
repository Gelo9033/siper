package ec.mil.ejercito.dgth.siper.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "PERG_ERGON")
public class PergErgon {
    @Id
    @Size(max = 15)
    @Column(name = "MEM_CEDULA", nullable = false, length = 15)
    private String memCedula;

    @Size(max = 2)
    @Column(name = "ERG_CABEZA", length = 2)
    private String ergCabeza;

    @Size(max = 2)
    @Column(name = "ERG_CUELLO", length = 2)
    private String ergCuello;

    @Column(name = "ERG_CALZAD")
    private Short ergCalzad;

    @Column(name = "ERG_PESO", precision = 6, scale = 3)
    private BigDecimal ergPeso;

    @Column(name = "ERG_ESTATU", precision = 5, scale = 2)
    private BigDecimal ergEstatu;

    @Size(max = 2)
    @Column(name = "ERG_TUNIFO", length = 2)
    private String ergTunifo;

    @Size(max = 250)
    @Column(name = "ERG_SENPAR", length = 250)
    private String ergSenpar;

    @Column(name = "ERG_TLANILLA", precision = 6, scale = 3)
    private BigDecimal ergTlanilla;

    @Size(max = 2)
    @Column(name = "ERG_TCAMISA", length = 2)
    private String ergTcamisa;

    @Size(max = 2)
    @Column(name = "ERG_TCALZONC", length = 2)
    private String ergTcalzonc;

    @Size(max = 2)
    @Column(name = "ERG_TCAMISETA", length = 2)
    private String ergTcamiseta;

    @Size(max = 2)
    @Column(name = "ERG_TMEDIAS", length = 2)
    private String ergTmedias;

    @Size(max = 2)
    @Column(name = "ERG_TCHCAMUF", length = 2)
    private String ergTchcamuf;

    @Size(max = 2)
    @Column(name = "ERG_TERLANILLA", length = 2)
    private String ergTerlanilla;

    @Column(name = "ERG_JOCKEY", precision = 6, scale = 3)
    private BigDecimal ergJockey;

    @Size(max = 2)
    @Column(name = "ERG_BOTASEL", length = 2)
    private String ergBotasel;

    @Size(max = 2)
    @Column(name = "ERG_ZAPCHAROL", length = 2)
    private String ergZapcharol;

    @Column(name = "FEC_ACTUALIZA")
    private LocalDate fecActualiza;

    @Size(max = 1)
    @Column(name = "ERG_UNIFOBOTACB", length = 1)
    private String ergUnifobotacb;

}