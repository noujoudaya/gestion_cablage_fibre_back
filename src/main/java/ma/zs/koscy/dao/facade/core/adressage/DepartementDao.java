package ma.zs.koscy.dao.facade.core.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.adressage.Ville;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartementDao extends AbstractRepository<Departement,Long> {
    Departement findByCode(String code);
    int deleteByCode(String code);

    @Query("SELECT NEW Departement(item.id,item.nom) FROM Departement item")
    List<Departement> findAllOptimized();
}
