package ma.zs.koscy.dao.facade.core.adressage;

import ma.zs.koscy.bean.core.adressage.Region;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegionDao extends AbstractRepository<Region,Long> {

    Region findByCode(String code);
    int deleteByCode(String code);

    @Query("SELECT NEW Region(item.id,item.code) FROM Region item")
    List<Region> findAllOptimized();
}
