package ma.zs.koscy.service.facade.admin.adressage;


import ma.zs.koscy.bean.core.adressage.Region;
import ma.zs.koscy.dao.criteria.core.adressage.RegionCriteria;
import ma.zs.koscy.zynerator.service.IService;

import java.util.List;

public interface RegionAdminService extends IService<Region, RegionCriteria> {

    Region findByCode(String code);
    int deleteByCode(String code);
    List<Region> findAll();
    //Region save(Region region);
}
