package ma.zs.koscy.service.impl.admin.adressage;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.dao.facade.core.adressage.SecteurDao;
import ma.zs.koscy.dao.specification.core.adressage.SecteurSpecification;
import ma.zs.koscy.service.facade.admin.adressage.SecteurAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecteurAdminServiceImpl extends AbstractServiceImpl<Secteur, SecteurCriteria, SecteurDao> implements SecteurAdminService {
    public Secteur findByReferenceEntity(Secteur t){
        return  dao.findByNom(t.getNom());
    }


    public List<Secteur> findAllOptimized() {
        return dao.findAllOptimized();
    }

    public List<Secteur> findByDepartementId(Long id){return dao.findByDepartementId(id);}

    public int deleteByDepartementId(Long id){return dao.deleteByDepartementId(id);}
    public long countByDepartementId(Long id){return dao.countByDepartementId(id);}

    public void configure() {
        super.configure(Secteur.class, SecteurSpecification.class);
    }


    public SecteurAdminServiceImpl(SecteurDao dao) {
        super(dao);
    }
}
