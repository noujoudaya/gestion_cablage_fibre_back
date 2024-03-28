package ma.zs.koscy.bean.core.commun;


import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import jakarta.persistence.*;

@Entity
@Table(name = "provider")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "provider_seq", sequenceName = "provider_seq", allocationSize = 1, initialValue = 1)
public class Provider extends AuditBusinessObject {

    private Long id;

    @Column(length = 500)
    private String raisonSocial;

    @Column(length = 500)
    private double idComentreprise;

    @Column(length = 500)
    private double identifiantFiscal;

    public Provider() {
        super();
    }

    public Provider(Long id) {
        this.id = id;
    }

    public Provider(Long id, String raisonSocial) {
        this.id = id;
        this.raisonSocial = raisonSocial;

    }

    public Provider(String raisonSocial) {
        this.raisonSocial = raisonSocial;

    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "provider_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaisonSocial() {
        return this.raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public double getIdComentreprise() {
        return this.idComentreprise;
    }

    public void setIdComentreprise(double idComentreprise) {
        this.idComentreprise = idComentreprise;
    }

    public double getIdentifiantFiscal() {
        return this.identifiantFiscal;
    }

    public void setIdentifiantFiscal(double identifiantFiscal) {
        this.identifiantFiscal = identifiantFiscal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider Provider = (Provider) o;
        return id != null && id.equals(Provider.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
