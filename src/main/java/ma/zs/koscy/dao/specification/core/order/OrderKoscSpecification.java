package  ma.zs.koscy.dao.specification.core.order;

import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.zynerator.specification.AbstractSpecification;


public class OrderKoscSpecification extends  AbstractSpecification<OrderKoscCriteria, OrderKosc>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("dateRdv", criteria.getDateRdv(), criteria.getDateRdvFrom(), criteria.getDateRdvTo());
        addPredicateFk("reasonKo","id", criteria.getReasonKo()==null?null:criteria.getReasonKo().getId());
        addPredicateFk("reasonKo","id", criteria.getReasonKos());
    }

    public OrderKoscSpecification(OrderKoscCriteria criteria) {
        super(criteria);
    }

    public OrderKoscSpecification(OrderKoscCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
