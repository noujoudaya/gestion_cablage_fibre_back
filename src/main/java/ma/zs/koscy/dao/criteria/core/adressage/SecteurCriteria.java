package ma.zs.koscy.dao.criteria.core.adressage;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

public class SecteurCriteria extends BaseCriteria {
    private String nom;
    private String nomLike;
    private String ville;
    private String villeLike;
    private DepartementCriteria departement;
    private List<DepartementCriteria> departements;

    public SecteurCriteria(){}

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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVilleLike() {
        return villeLike;
    }

    public void setVilleLike(String villeLike) {
        this.villeLike = villeLike;
    }

    public DepartementCriteria getDepartement() {
        return departement;
    }

    public void setDepartement(DepartementCriteria departement) {
        this.departement = departement;
    }

    public List<DepartementCriteria> getDepartements() {
        return departements;
    }

    public void setDepartements(List<DepartementCriteria> departements) {
        this.departements = departements;
    }
}
