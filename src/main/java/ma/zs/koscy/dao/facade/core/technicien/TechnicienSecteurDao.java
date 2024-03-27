package ma.zs.koscy.dao.facade.core.technicien;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TechnicienSecteurDao extends AbstractRepository<TechnicienSecteur,Long> {
    TechnicienSecteur findByTechnicienId(Long id);
    TechnicienSecteur findBySecteurId(Long id);

    int deleteByTechnicienId(Long id);
    int deleteBySecteurId(Long id);

}
