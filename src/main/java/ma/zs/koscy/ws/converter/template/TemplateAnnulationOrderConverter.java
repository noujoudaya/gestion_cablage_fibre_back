package ma.zs.koscy.ws.converter.template;

import ma.zs.koscy.bean.core.template.TemplateAnnulationOrder;
import ma.zs.koscy.ws.dto.template.TemplateAnnulationOrderDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemplateAnnulationOrderConverter extends AbstractConverter<TemplateAnnulationOrder, TemplateAnnulationOrderDto> {


    public  TemplateAnnulationOrderConverter() {
        super(TemplateAnnulationOrder.class, TemplateAnnulationOrderDto.class);
    }

    @Override
    public TemplateAnnulationOrder toItem(TemplateAnnulationOrderDto dto) {
        if (dto == null) {
            return null;
        } else {
            TemplateAnnulationOrder item = new TemplateAnnulationOrder();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());



            return item;
        }
    }

    @Override
    public TemplateAnnulationOrderDto toDto(TemplateAnnulationOrder item) {
        if (item == null) {
            return null;
        } else {
            TemplateAnnulationOrderDto dto = new TemplateAnnulationOrderDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


            return dto;
        }
    }
    public void initObject(boolean value) {
    }


}
