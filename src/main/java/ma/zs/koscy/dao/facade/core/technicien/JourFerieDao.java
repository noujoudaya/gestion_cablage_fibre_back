package ma.zs.koscy.dao.facade.core.technicien;

import ma.zs.koscy.bean.core.technicien.JourFerie;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JourFerieDao extends AbstractRepository<JourFerie,Long> {
    JourFerie findByCode(String code);
    int deleteByCode(String code);

    @Query("SELECT NEW JourFerie(item.id,item.code) FROM JourFerie item")
    List<JourFerie> findAllOptimized();
}
