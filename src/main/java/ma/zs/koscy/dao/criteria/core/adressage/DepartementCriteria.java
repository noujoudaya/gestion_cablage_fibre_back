package ma.zs.koscy.dao.criteria.core.adressage;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

public class DepartementCriteria extends BaseCriteria {
    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;
    private Region region;
    private Region regionLike;
    public DepartementCriteria(){}

    public String getCode() {return this.code;}

    public void setCode(String code) {this.code = code;}

    public String getCodeLike() {return this.codeLike;}

    public void setCodeLike(String codeLike) {this.codeLike = codeLike;}

    public String getNom() {return this.nom;}

    public void setNom(String nom) {this.nom = nom;}

    public String getNomLike() {return this.nomLike;}

    public void setNomLike(String nomLike) {this.nomLike = nomLike;}

    public Region getRegion() {return this.region;}

    public void setRegion(Region region) {this.region = region;}

    public Region getRegionLike() {return this.regionLike;}

    public void setRegionLike(Region regionLike) {this.regionLike = regionLike;}
}
