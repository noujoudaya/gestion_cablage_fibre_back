package ma.zs.koscy.dao.criteria.core.technicien;

import ma.zs.koscy.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;

public class JourFerieCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;

    public JourFerieCriteria(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

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
}
