package ma.zs.koscy.dao.facade.core.commun;

import org.springframework.data.jpa.repository.Query;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import ma.zs.koscy.bean.core.commun.ReasonKo;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ReasonKoDao extends AbstractRepository<ReasonKo,Long>  {


    @Query("SELECT NEW ReasonKo(item.id,item.libelle) FROM ReasonKo item")
    List<ReasonKo> findAllOptimized();

}
