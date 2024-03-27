package ma.zs.koscy.dao.criteria.core.adressage;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

public class RegionCriteria extends BaseCriteria {

    public RegionCriteria(){}

    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;




    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomLike() {
        return nomLike;
    }

    public void setNomLike(String nomLike) {
        this.nomLike = nomLike;
    }
}



