package ma.zs.koscy.service.facade.admin.technicien;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienSecteurCriteria;
import ma.zs.koscy.zynerator.service.IService;

public interface TechnicieSecteurAdminService extends IService<TechnicienSecteur, TechnicienSecteurCriteria> {
    TechnicienSecteur findByTechnicienId(Long id);
    TechnicienSecteur findBySecteurId(Long id);

    int deleteByTechnicienId(Long id);
    int deleteBySecteurId(Long id);
}
