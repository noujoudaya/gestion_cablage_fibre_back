package ma.zs.koscy.service.impl.admin.technicien;


import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.koscy.dao.facade.core.technicien.TechnicienDao;
import ma.zs.koscy.dao.specification.core.technicien.TechnicienSpecification;
import ma.zs.koscy.service.facade.admin.technicien.TechnicienAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import ma.zs.koscy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;





import org.springframework.beans.factory.annotation.Autowired;


import ma.zs.koscy.zynerator.security.service.facade.UserService;
import ma.zs.koscy.zynerator.security.service.facade.RoleService;
import ma.zs.koscy.zynerator.security.bean.Role;
import java.util.Collection;
import java.util.List;
@Service
public class TechnicienAdminServiceImpl extends AbstractServiceImpl<Technicien, TechnicienCriteria, TechnicienDao> implements TechnicienAdminService {






    public Technicien findByReferenceEntity(Technicien t){
        return  dao.findByCin(t.getCin());
    }


    public List<Technicien> findAllOptimized() {
        return dao.findAllOptimized();
    }




    @Override
    public Technicien create(Technicien t) {
        if (findByUsername(t.getUsername()) != null || t.getPassword() == null) return null;
        t.setPassword(userService.cryptPassword(t.getPassword()));
        t.setEnabled(true);
        t.setAccountNonExpired(true);
        t.setAccountNonLocked(true);
        t.setCredentialsNonExpired(true);
        t.setPasswordChanged(false);
        /*if (t.getRoles() != null) {
            Collection<Role> roles = new ArrayList<Role>();
            for (Role role : t.getRoles()) {
                roles.add(roleService.save(role));
            }
            t.setRoles(roles);
        }*/
        Technicien mySaved = super.create(t);

        return mySaved;
     }

    public Technicien findByUsername(String username){
    return dao.findByUsername(username);
    }

    public boolean changePassword(String username, String newPassword) {
    return userService.changePassword(username, newPassword);
    }

    public void configure() {
        super.configure(Technicien.class, TechnicienSpecification.class);
    }

    @Autowired
    private UserService userService;


    @Autowired
    private RoleService roleService;


    public TechnicienAdminServiceImpl(TechnicienDao dao) {
        super(dao);
    }

}
