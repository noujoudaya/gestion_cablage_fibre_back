package ma.zs.koscy.service.facade.admin.commun;

import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.dao.criteria.core.commun.ProviderCriteria;
import ma.zs.koscy.zynerator.service.IService;

import java.util.List;

public interface ProviderAdminService extends IService<Provider, ProviderCriteria> {

    Provider findByidcomentreprise(double idcomentreprise);
    Provider findByidentifiantFiscal(double identifiantFiscal);
    int deleteByidcomentreprise(double idcomentreprise);
    int deleteByidentifiantFiscal(double identifiantcommunentreprise);
    //List<Provider> findAll();
    //Provider save(Provider provider);

}
