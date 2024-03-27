package ma.zs.koscy.service.impl.admin.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.adressage.Ville;
import ma.zs.koscy.dao.criteria.core.adressage.VilleCriteria;
import ma.zs.koscy.dao.facade.core.adressage.DepartementDao;
import ma.zs.koscy.dao.facade.core.adressage.VilleDao;
import ma.zs.koscy.dao.specification.core.adressage.DepartementSpecification;
import ma.zs.koscy.dao.specification.core.adressage.VilleSpecification;
import ma.zs.koscy.service.facade.admin.adressage.VilleAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville, VilleCriteria, VilleDao> implements VilleAdminService {

    public Ville findByCode(String code) {
        return villeDao.findByCode(code);
    }
    public int deleteByCode(String code) {
        return villeDao.deleteByCode(code);
    }


    public List<Ville> findAll() {
        return villeDao.findAll();
    }

    private VilleDao villeDao;

    public void configure() {
        super.configure(Ville.class, VilleSpecification.class);
    }
    public VilleAdminServiceImpl(VilleDao dao) {
        super(dao);
    }
}
