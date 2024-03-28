package ma.zs.koscy.bean.core.technicien;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="JourFerie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="jourferie_seq",sequenceName="jourferie_seq",allocationSize=1, initialValue = 1)
public class JourFerie extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private LocalDateTime dateDebut;
    @Column(length = 500)
    private LocalDateTime dateFin;

    public JourFerie(){
        super();
    }

    public JourFerie(Long id){
        this.id = id;
    }

    public JourFerie(Long id,String code){
        this.id = id;
        this.code = code ;
    }

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jourferie_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JourFerie jourFerie = (JourFerie) o;
        return id != null && id.equals(jourFerie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
