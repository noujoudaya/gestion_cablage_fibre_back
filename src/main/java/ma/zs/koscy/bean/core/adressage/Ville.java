package ma.zs.koscy.bean.core.adressage;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import java.util.Objects;

@Entity
@Table(name = "Ville")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="Ville_seq",sequenceName="Ville_seq",allocationSize=1, initialValue = 1)
public class Ville extends AuditBusinessObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;
    @ManyToOne
    private Region region;

    public Ville() {super();}

    public Ville(Long id) {
        this.id = id;
    }

    public Ville(Long id, Long id1, String nom) {
        super(id);
        this.id = id1;
        this.nom = nom;
    }

    public Ville(String nom) {
        this.nom = nom;
    }
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="Ville_seq")
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return id != null && id.equals(ville.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
