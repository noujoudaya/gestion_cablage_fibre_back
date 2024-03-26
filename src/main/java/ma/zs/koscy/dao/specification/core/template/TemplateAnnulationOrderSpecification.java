package ma.zs.koscy.dao.specification.core.template;

import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.dao.criteria.core.template.TemplateAnnulationOrderCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;


public class TemplateAnnulationOrderSpecification extends AbstractSpecification<TemplateAnnulationOrderCriteria, TemplateAnnulationOrder> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TemplateAnnulationOrderSpecification(TemplateAnnulationOrderCriteria criteria) {
        super(criteria);
    }

    public TemplateAnnulationOrderSpecification(TemplateAnnulationOrderCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
