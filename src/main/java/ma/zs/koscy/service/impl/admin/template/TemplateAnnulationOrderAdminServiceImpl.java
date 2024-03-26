package ma.zs.koscy.service.impl.admin.template;


import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.dao.criteria.core.template.TemplateAnnulationOrderCriteria;
import ma.zs.koscy.dao.facade.core.template.TemplateAnnulationOrderDao;
import ma.zs.koscy.dao.specification.core.template.TemplateAnnulationOrderSpecification;
import ma.zs.koscy.service.facade.admin.template.TemplateAnnulationOrderAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TemplateAnnulationOrderAdminServiceImpl extends AbstractServiceImpl<TemplateAnnulationOrder, TemplateAnnulationOrderCriteria, TemplateAnnulationOrderDao> implements TemplateAnnulationOrderAdminService {






    public TemplateAnnulationOrder findByReferenceEntity(TemplateAnnulationOrder t){
        return  dao.findByCode(t.getCode());
    }


    public List<TemplateAnnulationOrder> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(TemplateAnnulationOrder.class, TemplateAnnulationOrderSpecification.class);
    }



    public TemplateAnnulationOrderAdminServiceImpl(TemplateAnnulationOrderDao dao) {
        super(dao);
    }

}
