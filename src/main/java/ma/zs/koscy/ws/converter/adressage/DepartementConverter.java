package ma.zs.koscy.ws.converter.adressage;

import ma.zs.koscy.bean.core.adressage.Departement;
import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.ws.dto.adressage.DepartementDto;
import ma.zs.koscy.ws.dto.template.TemplateAnnulationOrderDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class DepartementConverter extends AbstractConverter<Departement, DepartementDto> {
    public  DepartementConverter() {
        super(Departement.class, DepartementDto.class);
    }
    @Override
    public Departement toItem(DepartementDto dto) {
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
            if(StringUtil.isNotEmpty(dto.getSecteur()))
                item.setSecteur(dto.getSecteur());
            return item;
        }
    }

    public TemplateAnnulationOrderDto toDto(TemplateAnnulationOrder item) {
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
            if(StringUtil.isNotEmpty(item.getSecteur()))
                dto.setSecteur(item.getSecteur());
            return dto;
        }
    }
public void initObject(boolean value) {
}
}