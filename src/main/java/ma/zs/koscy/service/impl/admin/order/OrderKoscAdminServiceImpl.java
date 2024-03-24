package ma.zs.koscy.service.impl.admin.order;


import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.dao.facade.core.order.OrderKoscDao;
import ma.zs.koscy.dao.specification.core.order.OrderKoscSpecification;
import ma.zs.koscy.service.facade.admin.order.OrderKoscAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import ma.zs.koscy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;

import ma.zs.koscy.service.facade.admin.commun.ReasonKoAdminService ;
import ma.zs.koscy.bean.core.commun.ReasonKo ;

import java.util.List;
@Service
public class OrderKoscAdminServiceImpl extends AbstractServiceImpl<OrderKosc, OrderKoscCriteria, OrderKoscDao> implements OrderKoscAdminService {






    public OrderKosc findByReferenceEntity(OrderKosc t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(OrderKosc t){
        if( t != null) {
            t.setReasonKo(reasonKoService.findOrSave(t.getReasonKo()));
        }
    }

    public List<OrderKosc> findByReasonKoId(Long id){
        return dao.findByReasonKoId(id);
    }
    public int deleteByReasonKoId(Long id){
        return dao.deleteByReasonKoId(id);
    }
    public long countByReasonKoId(Long id){
        return dao.countByReasonKoId(id);
    }

    public List<OrderKosc> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(OrderKosc.class, OrderKoscSpecification.class);
    }


    @Autowired
    private ReasonKoAdminService reasonKoService ;

    public OrderKoscAdminServiceImpl(OrderKoscDao dao) {
        super(dao);
    }

}
