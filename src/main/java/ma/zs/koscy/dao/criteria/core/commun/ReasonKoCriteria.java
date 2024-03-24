package  ma.zs.koscy.dao.criteria.core.commun;



import ma.zs.koscy.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ReasonKoCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private String reasons;
    private String reasonsLike;
    private String description;
    private String descriptionLike;



    public ReasonKoCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getReasons(){
        return this.reasons;
    }
    public void setReasons(String reasons){
        this.reasons = reasons;
    }
    public String getReasonsLike(){
        return this.reasonsLike;
    }
    public void setReasonsLike(String reasonsLike){
        this.reasonsLike = reasonsLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


}
