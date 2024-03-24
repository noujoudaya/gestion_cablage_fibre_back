package ma.zs.koscy.dao.facade.core.technicien;

import org.springframework.data.jpa.repository.Query;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import ma.zs.koscy.bean.core.technicien.Technicien;
import org.springframework.stereotype.Repository;
import ma.zs.koscy.bean.core.technicien.Technicien;
import java.util.List;


@Repository
public interface TechnicienDao extends AbstractRepository<Technicien,Long>  {
    Technicien findByCin(String cin);
    int deleteByCin(String cin);

    Technicien findByUsername(String username);

    @Query("SELECT NEW Technicien(item.id,item.cin) FROM Technicien item")
    List<Technicien> findAllOptimized();

}
