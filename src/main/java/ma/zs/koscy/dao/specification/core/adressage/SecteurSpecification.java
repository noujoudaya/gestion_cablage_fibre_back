package ma.zs.koscy.dao.specification.core.adressage;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public abstract class SecteurSpecification extends AbstractSpecification<SecteurCriteria, Secteur> {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("ville", criteria.getVille(),criteria.getVilleLike());
        addPredicateFk("departement","id", criteria.getDepartement()==null?null:criteria.getDepartement().getId());
        addPredicateFk("departement","id", criteria.getDepartements());
    }

    public SecteurSpecification(SecteurCriteria criteria) {
        super(criteria);
    }

    public SecteurSpecification(SecteurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
