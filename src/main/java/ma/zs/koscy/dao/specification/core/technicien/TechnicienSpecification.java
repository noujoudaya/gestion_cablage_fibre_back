package  ma.zs.koscy.dao.specification.core.technicien;

import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;


public class TechnicienSpecification extends  AbstractSpecification<TechnicienCriteria, Technicien>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("cin", criteria.getCin(),criteria.getCinLike());
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
    }

    public TechnicienSpecification(TechnicienCriteria criteria) {
        super(criteria);
    }

    public TechnicienSpecification(TechnicienCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
