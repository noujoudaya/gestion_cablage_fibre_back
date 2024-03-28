package ma.zs.koscy.service.impl.admin.commun;


import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.dao.criteria.core.commun.ReasonKoCriteria;
import ma.zs.koscy.dao.facade.core.commun.ReasonKoDao;
import ma.zs.koscy.dao.specification.core.commun.ReasonKoSpecification;
import ma.zs.koscy.service.facade.admin.commun.ReasonKoAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import ma.zs.koscy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class ReasonKoAdminServiceImpl extends AbstractServiceImpl<ReasonKo, ReasonKoCriteria, ReasonKoDao> implements ReasonKoAdminService {






    public List<ReasonKo> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(ReasonKo.class, ReasonKoSpecification.class);
    }



    public ReasonKoAdminServiceImpl(ReasonKoDao dao) {
        super(dao);
    }

}
