package ma.zs.koscy.service.facade.admin.order;

import java.util.List;
import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.zynerator.service.IService;



public interface OrderKoscAdminService extends  IService<OrderKosc,OrderKoscCriteria>  {

    List<OrderKosc> findByReasonKoId(Long id);
    int deleteByReasonKoId(Long id);
    long countByReasonKoId(Long id);




}
