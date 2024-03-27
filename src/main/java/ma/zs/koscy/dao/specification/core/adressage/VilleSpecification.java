package ma.zs.koscy.dao.specification.core.adressage;

import ma.zs.koscy.bean.core.adressage.Ville;

import ma.zs.koscy.dao.criteria.core.adressage.DepartementCriteria;
import ma.zs.koscy.dao.criteria.core.adressage.VilleCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public class VilleSpecification extends AbstractSpecification<VilleCriteria, Ville> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getNom(),criteria.getNomLike());
    }

    public VilleSpecification(VilleCriteria criteria) {
        super(criteria);
    }

    public VilleSpecification(VilleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
