package ma.zs.koscy.dao.criteria.core.commun;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

public class ProviderCriteria extends BaseCriteria {
    private Long id;

    private Long idLike;
    private String raisonSocial;
    private String raisonSocialLike;
    private double idcomentreprise;
    private double idcomentrepriseLike;
    private double identifiantFiscal;
    private double identifiantFiscallike;

    public ProviderCriteria(){}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLike() {
        return idLike;
    }

    public void setIdLike(Long idLike) {
        this.idLike = idLike;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getRaisonSocialLike() {
        return raisonSocialLike;
    }

    public void setRaisonSocialLike(String raisonSocialLike) {
        this.raisonSocialLike = raisonSocialLike;
    }

    public String getIdcomentreprise() {
        return idcomentreprise;
    }

    public void setIdcomentreprise(double idcomentreprise) {
        this.idcomentreprise = idcomentreprise;
    }

    public String getIdcomentrepriseLike() {
        return idcomentrepriseLike;
    }

    public void setIdcomentrepriseLike(double idcomentrepriseLike) {
        this.idcomentrepriseLike = idcomentrepriseLike;
    }

    public String getIdentifiantFiscal() {
        return identifiantFiscal;
    }

    public void setIdentifiantFiscal(double identifiantFiscal) {
        this.identifiantFiscal = identifiantFiscal;
    }

    public String getIdentifiantFiscallike() {
        return identifiantFiscallike;
    }

    public void setIdentifiantFiscallike(double identifiantFiscallike) {
        this.identifiantFiscallike = identifiantFiscallike;
    }



}
