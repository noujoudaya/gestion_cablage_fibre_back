package ma.zs.koscy.bean.core.technicien;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="TechnicienSecteur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="techniciensecteur_seq",sequenceName="techniciensecteur_seq",allocationSize=1, initialValue = 1)
public class TechnicienSecteur extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private LocalDate dateDebut;
    @Column(length = 500)
    private  LocalDate dateFin;
    @Column(length = 500)
    @ManyToOne
    private Secteur secteur;
    @Column(length = 500)
    @ManyToOne
    private  Technicien technicien;

    public TechnicienSecteur(){
        super();
    }

    public TechnicienSecteur(Long id){
        this.id = id;
    }



    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "techniciensecteur_seq")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Secteur getSecteur() {
        return secteur;
    }
    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
    public Technicien getTechnicien() {
        return technicien;
    }
    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicienSecteur technicienSecteur = (TechnicienSecteur) o;
        return id != null && id.equals(technicienSecteur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
