package ma.zs.koscy.dao.facade.core.commun;

import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.bean.core.commun.Provider;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProviderDao  extends AbstractRepository<Provider,Long> {

    Provider findByidcomentreprise(double idcomentreprise);
    Provider findByidentifiantFiscal(double identifiantFiscal);
    int deleteByidcomentreprise(double idcomentreprise);
    int deleteByidentifiantFiscal(double identifiantcommunentreprise);
    
    
    @Query("SELECT NEW Provider(item.id,item.raisonSocial) FROM Provider item")
    List<Provider> findAllOptimized();
    
    
}
