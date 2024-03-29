package ma.zs.koscy.ws.dto.technicien;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.zynerator.audit.Log;
import ma.zs.koscy.zynerator.dto.AuditBaseDto;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicienSecteurDto extends AuditBaseDto {
    private Long id;
    private LocalDate dateDebut;
    private  LocalDate dateFin;
    private Secteur secteur;
    private Technicien technicien;

    public TechnicienSecteurDto(){super();}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Log
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Log
    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Log
    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    @Log
    public Technicien getTechnicien() {
        return technicien;
    }

    public void setTechnicien(Technicien technicien) {
        this.technicien = technicien;
    }
}
