package ma.zs.koscy.dao.specification.core.order;

import ma.zs.koscy.dao.criteria.core.etat.EtatOrderKoscCriteria;
import ma.zs.koscy.bean.core.etat.EtatOrderKosc;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public class EtatOrderKoscSpecification extends AbstractSpecification<EtatOrderKoscCriteria, EtatOrderKosc> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(), criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(), criteria.getLibelleLike());
        // Add predicates for other criteria fields as needed
    }

    public EtatOrderKoscSpecification(EtatOrderKoscCriteria criteria) {
        super(criteria);
    }

    public EtatOrderKoscSpecification(EtatOrderKoscCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
