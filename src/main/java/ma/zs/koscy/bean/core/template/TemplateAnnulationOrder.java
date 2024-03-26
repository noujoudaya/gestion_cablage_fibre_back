package ma.zs.koscy.bean.core.template;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

@Entity
public class TemplateAnnulationOrder  extends AuditBusinessObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String code  ;
    private String libelle  ;

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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
