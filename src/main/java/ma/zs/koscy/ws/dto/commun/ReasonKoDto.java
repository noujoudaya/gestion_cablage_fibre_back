package  ma.zs.koscy.ws.dto.commun;

import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReasonKoDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String reasons  ;
    private String description  ;




    public ReasonKoDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getReasons(){
        return this.reasons;
    }
    public void setReasons(String reasons){
        this.reasons = reasons;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
