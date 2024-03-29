package ma.zs.koscy.dao.specification.core.technicien;

import ma.zs.koscy.bean.core.technicien.JourFerie;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.technicien.JourFerieCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;

public abstract class JourFerieSpecification extends AbstractSpecification<JourFerieCriteria, JourFerie> {
    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("date", criteria.getDateDebut(),criteria.getDateFin());
    }

    public JourFerieSpecification(JourFerieCriteria criteria) {
        super(criteria);
    }

    public JourFerieSpecification(JourFerieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }
}
