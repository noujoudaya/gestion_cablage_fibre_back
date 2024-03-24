package ma.zs.koscy.zynerator.security.service.facade;

import ma.zs.koscy.zynerator.security.bean.Role;
import ma.zs.koscy.zynerator.security.dao.criteria.core.RoleCriteria;
import ma.zs.koscy.zynerator.service.IService;



public interface RoleService extends  IService<Role,RoleCriteria>  {
    Role findByAuthority(String authority);
    int deleteByAuthority(String authority);


    



}
