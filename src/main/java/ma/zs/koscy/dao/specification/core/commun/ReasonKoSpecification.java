package  ma.zs.koscy.dao.specification.core.commun;

import ma.zs.koscy.dao.criteria.core.commun.ReasonKoCriteria;
import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;


public class ReasonKoSpecification extends  AbstractSpecification<ReasonKoCriteria, ReasonKo>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("reasons", criteria.getReasons(),criteria.getReasonsLike());
    }

    public ReasonKoSpecification(ReasonKoCriteria criteria) {
        super(criteria);
    }

    public ReasonKoSpecification(ReasonKoCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
