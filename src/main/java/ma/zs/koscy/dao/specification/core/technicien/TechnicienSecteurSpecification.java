package ma.zs.koscy.dao.specification.core.technicien;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienSecteurCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public abstract class TechnicienSecteurSpecification extends AbstractSpecification<TechnicienSecteurCriteria, TechnicienSecteur> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("date", criteria.getDateDebut(), criteria.getDateFin());
        addPredicateFk("techniciensecteur","id", criteria.getTechnicien()==null?null:criteria.getTechnicien().getId());
        addPredicateFk("reasonKo","id", criteria.getTechniciens());
    }

    public TechnicienSecteurSpecification(TechnicienSecteurCriteria criteria) {
        super(criteria);
    }

    public TechnicienSecteurSpecification(TechnicienSecteurCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
