package ma.zs.koscy.ws.dto.adressage;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;

 @JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionDto  extends AuditBaseDto {
     private Long id;
     private String code;
     private String nom;
     public RegionDto(){
         super();
     }
 @Log
     public String getCode() {
         return this.code;
     }

     public void setCode(String code) {
         this.code = code;
     }

@Log
     public String getNom() {
         return this.nom;
     }

     public void setNom(String nom) {
         this.nom = nom;
     }


}
