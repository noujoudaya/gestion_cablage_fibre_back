package ma.zs.koscy.dao.facade.core.template;


import ma.zs.koscy.bean.core.template.TemplateConfirmationRdv;
import ma.zs.koscy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TemplateConfirmationRdvDao extends AbstractRepository<TemplateConfirmationRdv,Long> {
    TemplateConfirmationRdv findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TemplateConfirmationRdv(item.id,item.libelle) FROM TemplateConfirmationRdv item")
    List<TemplateConfirmationRdv> findAllOptimized();

}
