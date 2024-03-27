package ma.zs.koscy.service.impl.admin.template;



import ma.zs.koscy.bean.core.template.TemplateConfirmationRdv;
import ma.zs.koscy.dao.criteria.core.template.TemplateConfirmationRdvCriteria;
import ma.zs.koscy.dao.facade.core.template.TemplateConfirmationRdvDao;
import ma.zs.koscy.dao.specification.core.template.TemplateConfirmationRdvSpecification;
import ma.zs.koscy.service.facade.admin.template.TemplateConfirmationRdvAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class TemplateConfirmationRdvAdminServiceImpl extends AbstractServiceImpl<TemplateConfirmationRdv, TemplateConfirmationRdvCriteria, TemplateConfirmationRdvDao> implements TemplateConfirmationRdvAdminService{






    public TemplateConfirmationRdv findByReferenceEntity(TemplateConfirmationRdv t){
        return  dao.findByCode(t.getCode());
    }


    public List<TemplateConfirmationRdv> findAllOptimized() {
        return dao.findAllOptimized();
    }





    public void configure() {
        super.configure(TemplateConfirmationRdv.class, TemplateConfirmationRdvSpecification.class);
    }



    public TemplateConfirmationRdvAdminServiceImpl(TemplateConfirmationRdvDao dao) {
        super(dao);
    }

}
