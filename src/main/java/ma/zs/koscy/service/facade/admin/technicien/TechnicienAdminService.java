package ma.zs.koscy.service.facade.admin.technicien;

import java.util.List;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.zynerator.service.IService;



public interface TechnicienAdminService extends  IService<Technicien,TechnicienCriteria>  {
    Technicien findByUsername(String username);
    boolean changePassword(String username, String newPassword);





}
