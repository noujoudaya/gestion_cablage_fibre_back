package ma.zs.koscy.service.impl.admin.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.dao.criteria.core.adressage.DepartementCriteria;
import ma.zs.koscy.dao.facade.core.adressage.DepartementDao;
import ma.zs.koscy.dao.facade.core.template.TemplateAnnulationOrderDao;
import ma.zs.koscy.dao.specification.core.adressage.DepartementSpecification;
import ma.zs.koscy.dao.specification.core.template.TemplateAnnulationOrderSpecification;
import ma.zs.koscy.service.facade.admin.adressage.DepartementAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement, DepartementCriteria, DepartementDao> implements DepartementAdminService {


    @Override
    public void configure() {
        super.configure(Departement.class, DepartementSpecification.class);
    }

    public DepartementAdminServiceImpl(DepartementDao dao) {
        super(dao);
    }
}
