package ma.zs.koscy.bean.core.adressage;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "Departement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="Departement_seq",sequenceName="Departement_seq",allocationSize=1, initialValue = 1)
public class Departement extends AuditBusinessObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
=======
import jakarta.persistence.*;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
>>>>>>> 8d4621a (beans:Depart,ville,tempAnnul)
    private String nom;
    @ManyToOne
    private Secteur secteur;

<<<<<<< HEAD
 public Departement() {super();}
    public Departement(Long id) {
        this.id = id;
    }

    public Departement(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Departement(Long id, Long id1, String nom) {
        super(id);
        this.id = id1;
        this.nom = nom;
    }

    public Departement(String nom) {
        this.nom = nom;
    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="Departement_seq")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

>>>>>>> 8d4621a (beans:Depart,ville,tempAnnul)
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
<<<<<<< HEAD
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement departement = (Departement) o;
        return id != null && id.equals(departement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

=======
}


>>>>>>> 8d4621a (beans:Depart,ville,tempAnnul)
