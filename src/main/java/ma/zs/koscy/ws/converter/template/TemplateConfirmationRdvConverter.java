package ma.zs.koscy.ws.converter.template;


import ma.zs.koscy.bean.core.template.TemplateConfirmationRdv;
import ma.zs.koscy.ws.dto.template.TemplateConfirmationRdvDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class TemplateConfirmationRdvConverter extends AbstractConverter<TemplateConfirmationRdv, TemplateConfirmationRdvDto> {


    public  TemplateConfirmationRdvConverter() {
        super(TemplateConfirmationRdv.class, TemplateConfirmationRdvDto.class);
    }

    @Override
    public TemplateConfirmationRdv toItem(TemplateConfirmationRdvDto dto) {
        if (dto == null) {
            return null;
        } else {
            TemplateConfirmationRdv item = new TemplateConfirmationRdv();
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
    public TemplateConfirmationRdvDto toDto(TemplateConfirmationRdv item) {
        if (item == null) {
            return null;
        } else {
            TemplateConfirmationRdvDto dto = new TemplateConfirmationRdvDto();
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
