package ma.zs.koscy.service.facade.admin.order;

import java.util.List;
import ma.zs.koscy.bean.core.order.EtatOrderKosc;
import ma.zs.koscy.dao.criteria.core.order.EtatOrderKoscCriteria;
import ma.zs.koscy.zynerator.service.IService;

public interface EtatOrderKoscAdminService extends IService<EtatOrderKosc, EtatOrderKoscCriteria> {


    List<EtatOrderKosc> findBySomeCustomCondition(SomeType someValue);
    int deleteBySomeProperty(SomeType someValue);

}
