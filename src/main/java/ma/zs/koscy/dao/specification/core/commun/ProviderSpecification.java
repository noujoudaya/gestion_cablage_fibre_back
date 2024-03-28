package ma.zs.koscy.dao.specification.core.commun;

import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.dao.criteria.core.commun.ProviderCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public class ProviderSpecification extends AbstractSpecification<ProviderCriteria, Provider> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("raisonSocial", criteria.getRaisonSocial(),criteria.getRaisonSocialLike());
        addPredicate("idcomentreprise", criteria.getIdcomentreprise(),criteria.getIdcomentrepriseLike());
        addPredicate("identifiantFiscal", criteria.getIdentifiantFiscal(),criteria.getIdentifiantFiscallike());

    }

    public ProviderSpecification(ProviderCriteria criteria) {
        super(criteria);
    }

    public ProviderSpecification(ProviderCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
