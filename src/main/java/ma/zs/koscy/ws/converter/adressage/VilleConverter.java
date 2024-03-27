package ma.zs.koscy.ws.converter.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.adressage.Ville;
import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.ws.dto.adressage.DepartementDto;
import ma.zs.koscy.ws.dto.adressage.VilleDto;
import ma.zs.koscy.ws.dto.template.TemplateAnnulationOrderDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class VilleConverter extends AbstractConverter<Ville, VilleDto> {
    public  VilleConverter() {
        super(Ville.class, VilleDto.class);
    }



    @Override
    public Ville toItem(VilleDto dto) {
        if (dto == null) {
            return null;
        } else {
            Departement item = new Departement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getRegion()))
                item.setRegion(dto.getRegion());
            return item;
        }
    }

    @Override
    public VilleDto toDto(Ville item) {
        if (item == null) {
            return null;
        } else {
            DepartementDto dto = new DepartementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());

            if(StringUtil.isNotEmpty(item.getRegion()))
                dto.setRegion(item.getRegion());
            return dto;
        }
    }

    public void initObject(boolean value) {
    }
}