package ma.zs.koscy.bean.core.order;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


import ma.zs.koscy.bean.core.commun.ReasonKo;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zs.koscy.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "order_kosc")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="order_kosc_seq",sequenceName="order_kosc_seq",allocationSize=1, initialValue = 1)
public class OrderKosc   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateRdv ;

    private ReasonKo reasonKo ;


    public OrderKosc(){
        super();
    }

    public OrderKosc(Long id){
        this.id = id;
    }

    public OrderKosc(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }
    public OrderKosc(String libelle){
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="order_kosc_seq")
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
    public LocalDateTime getDateRdv(){
        return this.dateRdv;
    }
    public void setDateRdv(LocalDateTime dateRdv){
        this.dateRdv = dateRdv;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reason_ko")
    public ReasonKo getReasonKo(){
        return this.reasonKo;
    }
    public void setReasonKo(ReasonKo reasonKo){
        this.reasonKo = reasonKo;
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
        OrderKosc orderKosc = (OrderKosc) o;
        return id != null && id.equals(orderKosc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

