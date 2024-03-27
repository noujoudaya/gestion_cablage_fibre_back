package ma.zs.koscy.bean.core.adressage;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

import ma.zs.koscy.zynerator.audit.AuditBusinessObject;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "region_seq", sequenceName = "region_seq", allocationSize = 1, initialValue = 1)
public class Region extends AuditBusinessObject {

    private Long id;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;

    public Region() {
        super();
    }

    public Region(Long id) {
        this.id = id;
    }
    public Region(String code) {
        this.code= code;
    }



    public Region(Long id,String code ) {
        this.code = code;
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_seq")
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

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region Region = (Region) o;
        return id != null && id.equals(Region.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}