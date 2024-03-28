package ma.zs.koscy.ws.converter.adressage;


import ma.zs.koscy.bean.core.adressage.Region;
import ma.zs.koscy.ws.dto.adressage.RegionDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component

public class RegionConverter extends AbstractConverter<Region, RegionDto> {

    public  RegionConverter() {
        super(Region.class, RegionDto.class);
    }

    @Override
    public Region toItem(RegionDto dto) {
        if (dto == null) {
            return null;
        } else {
            Region item = new Region();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());

            return item;
        }
    }

    @Override
    public RegionDto toDto(Region item) {
        if (item == null) {
            return null;
        } else {
            RegionDto dto = new RegionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());

            return dto;
        }
    }
    
    public void initObject(boolean value) {
    }


}
