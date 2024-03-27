package ma.zs.koscy.bean.core.technicien;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="JourFerie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="jourferie_seq",sequenceName="jourferie_seq",allocationSize=1, initialValue = 1)
public class JourFerie extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private double code;
    @Column(length = 500)
    private LocalDate dateDebut;
    @Column(length = 500)
    private LocalDate dateFin;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jourferie_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JourFerie jourFerie = (JourFerie) o;
        return id != null && id.equals(jourFerie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
