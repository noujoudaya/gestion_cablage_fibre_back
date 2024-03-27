package ma.zs.koscy.dao.criteria.core.technicien;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

import java.time.LocalDate;

public class JourFerieCriteria extends BaseCriteria {

    private double code;
    private double codeLike;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public JourFerieCriteria(){}

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(double codeLike) {
        this.codeLike = codeLike;
    }

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
}
