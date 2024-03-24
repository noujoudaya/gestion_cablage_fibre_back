package  ma.zs.koscy.dao.criteria.core.order;


import ma.zs.koscy.dao.criteria.core.commun.ReasonKoCriteria;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class OrderKoscCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private LocalDateTime dateRdv;
    private LocalDateTime dateRdvFrom;
    private LocalDateTime dateRdvTo;

    private ReasonKoCriteria reasonKo ;
    private List<ReasonKoCriteria> reasonKos ;


    public OrderKoscCriteria(){}

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

    public LocalDateTime getDateRdv(){
        return this.dateRdv;
    }
    public void setDateRdv(LocalDateTime dateRdv){
        this.dateRdv = dateRdv;
    }
    public LocalDateTime getDateRdvFrom(){
        return this.dateRdvFrom;
    }
    public void setDateRdvFrom(LocalDateTime dateRdvFrom){
        this.dateRdvFrom = dateRdvFrom;
    }
    public LocalDateTime getDateRdvTo(){
        return this.dateRdvTo;
    }
    public void setDateRdvTo(LocalDateTime dateRdvTo){
        this.dateRdvTo = dateRdvTo;
    }

    public ReasonKoCriteria getReasonKo(){
        return this.reasonKo;
    }

    public void setReasonKo(ReasonKoCriteria reasonKo){
        this.reasonKo = reasonKo;
    }
    public List<ReasonKoCriteria> getReasonKos(){
        return this.reasonKos;
    }

    public void setReasonKos(List<ReasonKoCriteria> reasonKos){
        this.reasonKos = reasonKos;
    }
}
