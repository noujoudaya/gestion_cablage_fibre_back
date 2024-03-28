package ma.zs.koscy.dao.specification.core.adressage;


import ma.zs.koscy.bean.core.adressage.Region;
import ma.zs.koscy.dao.criteria.core.adressage.RegionCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public class RegionSpecification extends AbstractSpecification<RegionCriteria, Region> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());

    }
    public RegionSpecification(RegionCriteria criteria) {
        super(criteria);
    }

    public RegionSpecification(RegionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
