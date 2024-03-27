package ma.zs.koscy.ws.dto.template;

import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;
import ma.zs.koscy.zynerator.dto.BaseDto;



import com.fasterxml.jackson.annotation.JsonInclude;





@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateConfirmationRdvDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public TemplateConfirmationRdvDto(){
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








}
