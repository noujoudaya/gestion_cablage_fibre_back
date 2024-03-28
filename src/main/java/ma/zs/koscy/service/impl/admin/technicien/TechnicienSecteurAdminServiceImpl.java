package ma.zs.koscy.service.impl.admin.technicien;

import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienSecteurCriteria;
import ma.zs.koscy.dao.facade.core.technicien.TechnicienSecteurDao;
import ma.zs.koscy.dao.specification.core.technicien.TechnicienSecteurSpecification;

import ma.zs.koscy.service.facade.admin.technicien.TechnicieSecteurAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TechnicienSecteurAdminServiceImpl extends AbstractServiceImpl<TechnicienSecteur, TechnicienSecteurCriteria, TechnicienSecteurDao> implements TechnicieSecteurAdminService {
    public TechnicienSecteur findByTechnicienId(Long id){return dao.findByTechnicienId(id);}
    public TechnicienSecteur findBySecteurId(Long id){return dao.findBySecteurId(id);}

    public int deleteByTechnicienId(Long id){return dao.deleteByTechnicienId(id);}

    public int deleteBySecteurId(Long id){return dao.deleteBySecteurId(id);}
    public void configure() {
        super.configure(TechnicienSecteur.class, TechnicienSecteurSpecification.class);
    }

    public TechnicienSecteurAdminServiceImpl(TechnicienSecteurDao dao) {
        super(dao);
    }
}
