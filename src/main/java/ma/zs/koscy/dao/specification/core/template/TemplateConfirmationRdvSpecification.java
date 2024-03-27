package ma.zs.koscy.dao.specification.core.template;

import ma.zs.koscy.bean.core.template.TemplateConfirmationRdv;
import ma.zs.koscy.dao.criteria.core.template.TemplateConfirmationRdvCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;


public class TemplateConfirmationRdvSpecification extends AbstractSpecification<TemplateConfirmationRdvCriteria, TemplateConfirmationRdv> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TemplateConfirmationRdvSpecification(TemplateConfirmationRdvCriteria criteria) {
        super(criteria);
    }

    public TemplateConfirmationRdvSpecification(TemplateConfirmationRdvCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}//package ma.zs.koscy.dao.specification.core.template;


