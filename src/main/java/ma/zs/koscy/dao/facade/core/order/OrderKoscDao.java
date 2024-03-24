package ma.zs.koscy.dao.facade.core.order;

import org.springframework.data.jpa.repository.Query;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import ma.zs.koscy.bean.core.order.OrderKosc;
import org.springframework.stereotype.Repository;
import ma.zs.koscy.bean.core.order.OrderKosc;
import java.util.List;


@Repository
public interface OrderKoscDao extends AbstractRepository<OrderKosc,Long>  {
    OrderKosc findByCode(String code);
    int deleteByCode(String code);

    List<OrderKosc> findByReasonKoId(Long id);
    int deleteByReasonKoId(Long id);
    long countByReasonKoId(Long id);

    @Query("SELECT NEW OrderKosc(item.id,item.libelle) FROM OrderKosc item")
    List<OrderKosc> findAllOptimized();

}
