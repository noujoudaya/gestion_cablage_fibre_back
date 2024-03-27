package ma.zs.koscy.ws.dto.adressage;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.ManyToOne;
import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartementDto extends AuditBaseDto {
    private Long id;
    private String code;
    private String nom;
    private Secteur secteur;
@Log
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
@Log
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
@Log
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
@Log
    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
}
