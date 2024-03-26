package ma.zs.koscy.bean.core.template;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;
import java.util.Objects;


@Entity
@Table(name = "template_annulation_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="template_annulation_order_seq",sequenceName="template_annulation_order_seq",allocationSize=1, initialValue = 1)
public class TemplateAnnulationOrder   extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;



    public TemplateAnnulationOrder(){
        super();
    }

    public TemplateAnnulationOrder(Long id){
        this.id = id;
    }

    public TemplateAnnulationOrder(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public TemplateAnnulationOrder(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="template_annulation_order_seq")
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

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemplateAnnulationOrder templateAnnulationOrder = (TemplateAnnulationOrder) o;
        return id != null && id.equals(templateAnnulationOrder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

