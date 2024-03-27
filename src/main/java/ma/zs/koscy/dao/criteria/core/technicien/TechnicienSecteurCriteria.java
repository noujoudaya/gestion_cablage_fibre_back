package ma.zs.koscy.dao.criteria.core.technicien;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.List;

public class TechnicienSecteurCriteria extends BaseCriteria {
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private Secteur secteur;
    private List<SecteurCriteria> secteurs;
    private Technicien technicien;
    private List<TechnicienCriteria> techniciens;

    public TechnicienSecteurCriteria(){}

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
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
