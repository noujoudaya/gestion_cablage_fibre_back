package ma.zs.koscy.ws.dto.commun;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProviderDto  extends AuditBaseDto {
    private String raisonSocial;
    private double idcomentreprise;
    private double identifiantFiscal;



    public ProviderDto(){
        super();
    }

@Log
    public String getRaisonSocial() {
        return this.raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }
@Log
    public double getIdComentreprise() {
        return this.idcomentreprise;
    }

    public void setIdComentreprise(double idComentreprise) {
        this.idcomentreprise = idComentreprise;
    }
@Log
    public double getIdentifiantFiscal() {
        return this.identifiantFiscal;
    }

    public void setIdentifiantFiscal(double identifiantFiscal) {
        this.identifiantFiscal = identifiantFiscal;
    }

}
