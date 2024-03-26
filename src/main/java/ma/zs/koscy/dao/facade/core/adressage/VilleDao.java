package ma.zs.koscy.dao.facade.core.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.adressage.Ville;
import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VilleDao extends AbstractRepository<Ville,Long> {
    Ville findByCode(String code);
    int deleteByCode(String code);
    @Query("SELECT NEW Ville(item.id,item.nom) FROM Ville item")
    List<Ville> findAllOptimized();
}
