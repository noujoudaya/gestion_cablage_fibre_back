package ma.zs.koscy.bean.core.order;

import java.util.Objects;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import ma.zs.koscy.zynerator.audit.AuditBusinessObject;
import jakarta.persistence.*;

@Entity
@Table(name = "etat_order_kosc")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "etat_order_kosc_seq", sequenceName = "etat_order_kosc_seq", allocationSize = 1, initialValue = 1)
public class EtatOrderKosc extends AuditBusinessObject {

    private Long id;
    private String code;
    private String libelle;

    public EtatOrderKosc() {
        super();
    }

    public EtatOrderKosc(Long id) {
        this.id = id;
    }

    public EtatOrderKosc(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public EtatOrderKosc(String libelle) {
        this.libelle = libelle;
    }

   @Id
 @Column(name ="id" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etat_order_kosc_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Transient
    public String getLabel() {
        return libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatOrderKosc etatOrderKosc = (EtatOrderKosc) o;
        return id != null && id.equals(etatOrderKosc.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
