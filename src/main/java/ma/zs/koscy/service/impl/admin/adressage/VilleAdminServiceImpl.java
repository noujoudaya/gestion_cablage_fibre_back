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

public class VilleAdminServiceImpl extends AbstractServiceImpl<Ville, VilleCriteria, VilleDao> implements VilleAdminService {

    @Override
    public void configure() {
        super.configure(Ville.class, VilleSpecification.class);
    }
    public VilleAdminServiceImpl(VilleDao dao) {
        super(dao);
    }
}
