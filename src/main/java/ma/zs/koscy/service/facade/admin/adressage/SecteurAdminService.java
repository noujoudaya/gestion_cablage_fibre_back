package ma.zs.koscy.service.facade.admin.adressage;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.adressage.SecteurCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.zynerator.service.IService;

import java.util.List;

public interface SecteurAdminService extends IService<Secteur, SecteurCriteria> {
    List<Secteur> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    long countByDepartementId(Long id);
}
