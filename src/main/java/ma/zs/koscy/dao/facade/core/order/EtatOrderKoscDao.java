package ma.zs.koscy.dao.facade.core.order;

import org.springframework.data.jpa.repository.Query;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import ma.zs.koscy.bean.core.etat.EtatOrderKosc;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EtatOrderKoscDao extends AbstractRepository<EtatOrderKosc, Long> {
    EtatOrderKosc findByCode(String code);
    int deleteByCode(String code);

    @Query("SELECT e FROM EtatOrderKosc e WHERE e.someProperty = :someValue")
    List<EtatOrderKosc> findBySomeCustomCondition(@Param("someValue") SomeType someValue);

    long countBySomeProperty(SomeType someValue);





   }
