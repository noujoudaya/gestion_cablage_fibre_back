package ma.zs.koscy.dao.facade.core.template;

import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TemplateAnnulationOrderDao extends AbstractRepository<TemplateAnnulationOrder,Long> {
    TemplateAnnulationOrder findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TemplateAnnulationOrder(item.id,item.libelle) FROM TemplateAnnulationOrder item")
    List<TemplateAnnulationOrder> findAllOptimized();

}
