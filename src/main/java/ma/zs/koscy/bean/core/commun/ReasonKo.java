package ma.zs.koscy.bean.core.commun;

import java.util.Objects;







import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "reason_ko")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reason_ko_seq",sequenceName="reason_ko_seq",allocationSize=1, initialValue = 1)
public class ReasonKo   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String reasons;
    @Column(length = 500)
    private String description;



    public ReasonKo(){
        super();
    }

    public ReasonKo(Long id){
        this.id = id;
    }

    public ReasonKo(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public ReasonKo(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="reason_ko_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getReasons(){
        return this.reasons;
    }
    public void setReasons(String reasons){
        this.reasons = reasons;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReasonKo reasonKo = (ReasonKo) o;
        return id != null && id.equals(reasonKo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

