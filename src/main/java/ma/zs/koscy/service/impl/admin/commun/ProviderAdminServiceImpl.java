package ma.zs.koscy.service.impl.admin.commun;

import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.dao.criteria.core.commun.ProviderCriteria;
import ma.zs.koscy.dao.facade.core.commun.ProviderDao;
import ma.zs.koscy.dao.facade.core.commun.ProviderDao;
import ma.zs.koscy.dao.specification.core.commun.ProviderSpecification;
import ma.zs.koscy.service.facade.admin.commun.ProviderAdminService;
import ma.zs.koscy.service.facade.admin.commun.ProviderAdminService;
import ma.zs.koscy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderAdminServiceImpl extends AbstractServiceImpl<Provider, ProviderCriteria, ProviderDao> implements ProviderAdminService {


    public Provider findByidcomentreprise(double idcomentreprise) {
        return ProviderService.findByidcomentreprise(idcomentreprise);
    }


    public Provider findByidentifiantFiscal(double identifiantFiscal) {
        return ProviderService.findByidentifiantFiscal(identifiantFiscal);
    }


    public int deleteByidcomentreprise(double idcomentreprise) {
        return ProviderService.deleteByidcomentreprise(idcomentreprise);
    }


    public int deleteByidentifiantFiscal(double identifiantcommunentreprise) {
        return ProviderService.deleteByidentifiantFiscal(identifiantcommunentreprise);
    }

    public List<Provider> findAllOptimized() {
        return dao.findAllOptimized();
    }

    public ProviderAdminServiceImpl(ProviderDao dao) {
        super(dao);
    }

    public void configure() {
        super.configure(Provider.class, ProviderSpecification.class);
    }

    @Autowired
    private ProviderAdminService ProviderService;



//    public Provider save(Provider provider) {
//
//        if (provider == null) {
//            throw new IllegalArgumentException("Le fournisseur ne peut pas être null");
//        }
//        if (findByRaisonSocial(provider.getRaisonSocial()) != null) {
//           return null;
//        } else if (provider.getIdComentreprise() == 0) {
//           return null;
//        } else if (provider.getIdentifiantFiscal() == 0) {
//            return null;
//        } else {
//           return dao.save(provider);
//        }
//    }

}
