package ma.zs.koscy.dao.criteria.core.technicien;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.zynerator.criteria.BaseCriteria;

import java.time.LocalDate;
import java.util.List;

public class TechnicienSecteurCriteria extends BaseCriteria {
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Secteur secteur;
    private List<SecteurCriteria> secteurs;
    private Technicien technicien;
    private List<TechnicienCriteria> techniciens;

    public TechnicienSecteurCriteria(){}

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public List<SecteurCriteria> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<SecteurCriteria> secteurs) {
        this.secteurs = secteurs;
    }

    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }

    public List<TechnicienCriteria> getTechniciens() {
        return techniciens;
    }

    public void setTechniciens(List<TechnicienCriteria> techniciens) {
        this.techniciens = techniciens;
    }
}
