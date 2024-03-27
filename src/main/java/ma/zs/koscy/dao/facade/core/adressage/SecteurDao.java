package ma.zs.koscy.dao.facade.core.adressage;

import ma.zs.koscy.bean.core.adressage.Secteur;
import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecteurDao extends AbstractRepository<Secteur,Long> {
    Secteur findByNom(String nom);
    int deleteByNom(String nom);

    List<Secteur> findByDepartementId(Long id);
    int deleteByDepartementId(Long id);
    long countByDepartementId(Long id);

    @Query("SELECT NEW Secteur(item.id,item.nom) FROM Secteur item")
    List<Secteur> findAllOptimized();
}
