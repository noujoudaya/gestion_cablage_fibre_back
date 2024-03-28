package ma.zs.koscy.service.impl.admin.technicien;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.bean.core.technicien.JourFerie;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.JourFerieCriteria;
import ma.zs.koscy.dao.facade.core.order.OrderKoscDao;
import ma.zs.koscy.dao.facade.core.technicien.JourFerieDao;
import ma.zs.koscy.dao.specification.core.order.OrderKoscSpecification;
import ma.zs.koscy.dao.specification.core.technicien.JourFerieSpecification;
import ma.zs.koscy.service.facade.admin.order.OrderKoscAdminService;
import ma.zs.koscy.service.facade.admin.technicien.JourFerieAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;

import java.util.List;

public class JourFerieAdminServiceImpl extends AbstractServiceImpl<JourFerie, JourFerieCriteria, JourFerieDao> implements JourFerieAdminService {
    public JourFerie findByReferenceEntity(JourFerie t){
        return  dao.findByCode(t.getCode());
    }

    public List<JourFerie> findAllOptimized() {
        return dao.findAllOptimized();
    }

    public JourFerie findByCode(String code){return dao.findByCode(code);}
    public int deleteByCode(String code){return dao.deleteByCode(code);}

    public void configure() {
        super.configure(JourFerie.class, JourFerieSpecification.class);
    }
    public JourFerieAdminServiceImpl(JourFerieDao dao) {
        super(dao);
    }
}
