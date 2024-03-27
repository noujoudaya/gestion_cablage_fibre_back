package ma.zs.koscy.dao.specification.core.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.dao.criteria.core.adressage.DepartementCriteria;
import ma.zs.koscy.dao.criteria.core.template.TemplateAnnulationOrderCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public class DepartementSpecification extends AbstractSpecification<DepartementCriteria, Departement> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getNom(),criteria.getNomLike());
    }

    public DepartementSpecification(DepartementCriteria criteria) {
        super(criteria);
    }

    public DepartementSpecification(DepartementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
