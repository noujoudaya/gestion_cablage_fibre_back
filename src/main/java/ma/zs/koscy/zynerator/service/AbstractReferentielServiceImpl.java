package ma.zs.koscy.zynerator.service;

import ma.zs.koscy.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.zs.koscy.zynerator.criteria.BaseCriteria;
import ma.zs.koscy.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, CRITERIA extends BaseCriteria, REPO extends AbstractRepository<T, Long>> extends AbstractServiceImpl<T, CRITERIA, REPO> {

    public AbstractReferentielServiceImpl(REPO dao) {
        super(dao);
    }

}
