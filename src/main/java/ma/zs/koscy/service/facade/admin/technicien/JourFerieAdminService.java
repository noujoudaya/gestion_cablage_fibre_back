package ma.zs.koscy.service.facade.admin.technicien;

import ma.zs.koscy.bean.core.technicien.JourFerie;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.technicien.JourFerieCriteria;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.zynerator.service.IService;

public interface JourFerieAdminService extends IService<JourFerie, JourFerieCriteria> {
    JourFerie findByCode(String code);
    int deleteByCode(String code);
}
