package  ma.zs.koscy.ws.converter.commun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.koscy.zynerator.util.StringUtil;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.DateUtil;
import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.ws.dto.commun.ReasonKoDto;

@Component
public class ReasonKoConverter extends AbstractConverter<ReasonKo, ReasonKoDto> {


    public  ReasonKoConverter() {
        super(ReasonKo.class, ReasonKoDto.class);
    }

    @Override
    public ReasonKo toItem(ReasonKoDto dto) {
        if (dto == null) {
            return null;
        } else {
        ReasonKo item = new ReasonKo();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getReasons()))
                item.setReasons(dto.getReasons());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());



        return item;
        }
    }

    @Override
    public ReasonKoDto toDto(ReasonKo item) {
        if (item == null) {
            return null;
        } else {
            ReasonKoDto dto = new ReasonKoDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getReasons()))
                dto.setReasons(item.getReasons());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
