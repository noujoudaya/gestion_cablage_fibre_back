package ma.zs.koscy.bean.core.adressage;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;


import java.util.Objects;

@Entity
@Table(name="secteur")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="secteur_seq",sequenceName="secteur_seq",allocationSize=1, initialValue = 1)
public class Secteur extends AuditBusinessObject {


    private Long id;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String ville;
    @Column(length = 500)
    @ManyToOne
    private Departement departement ;

    public Secteur(){
        super();
    }

    public Secteur(Long id){
        this.id = id;
    }

    public Secteur(Long id,String nom){
        this.id = id;
        this.nom = nom ;
    }


    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secteur_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Transient
    public String getLabel() {
        label = nom;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secteur secteur = (Secteur) o;
        return id != null && id.equals(secteur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
