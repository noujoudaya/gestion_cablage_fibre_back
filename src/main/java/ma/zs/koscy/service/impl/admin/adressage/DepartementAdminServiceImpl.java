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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementAdminServiceImpl extends AbstractServiceImpl<Departement, DepartementCriteria, DepartementDao> implements DepartementAdminService {

    public Departement findByCode(String code) {
        return departementDao.findByCode(code);
    }

    public int deleteByCode(String code) {
        return departementDao.deleteByCode(code);
    }


    public List<Departement> findAll() {
        return departementDao.findAll();
    }


    private DepartementDao departementDao;

    public void configure() {
        super.configure(Departement.class, DepartementSpecification.class);
    }

    public DepartementAdminServiceImpl(DepartementDao dao) {
        super(dao);
    }
}
