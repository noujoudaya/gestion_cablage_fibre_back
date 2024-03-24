package  ma.zs.koscy.ws.dto.order;

import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.koscy.ws.dto.commun.ReasonKoDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderKoscDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String dateRdv ;

    private ReasonKoDto reasonKo ;



    public OrderKoscDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateRdv(){
        return this.dateRdv;
    }
    public void setDateRdv(String dateRdv){
        this.dateRdv = dateRdv;
    }


    public ReasonKoDto getReasonKo(){
        return this.reasonKo;
    }

    public void setReasonKo(ReasonKoDto reasonKo){
        this.reasonKo = reasonKo;
    }






}
