package  ma.zs.koscy.ws.converter.technicien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.koscy.zynerator.util.StringUtil;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.DateUtil;
import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.ws.dto.technicien.TechnicienDto;

@Component
public class TechnicienConverter extends AbstractConverter<Technicien, TechnicienDto> {


    public  TechnicienConverter() {
        super(Technicien.class, TechnicienDto.class);
    }

    @Override
    public Technicien toItem(TechnicienDto dto) {
        if (dto == null) {
            return null;
        } else {
        Technicien item = new Technicien();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            item.setCredentialsNonExpired(dto.getCredentialsNonExpired());
            item.setEnabled(dto.getEnabled());
            item.setAccountNonExpired(dto.getAccountNonExpired());
            item.setAccountNonLocked(dto.getAccountNonLocked());
            item.setPasswordChanged(dto.getPasswordChanged());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());


            //item.setRoles(dto.getRoles());

        return item;
        }
    }

    @Override
    public TechnicienDto toDto(Technicien item) {
        if (item == null) {
            return null;
        } else {
            TechnicienDto dto = new TechnicienDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getCredentialsNonExpired()))
                dto.setCredentialsNonExpired(item.getCredentialsNonExpired());
            if(StringUtil.isNotEmpty(item.getEnabled()))
                dto.setEnabled(item.getEnabled());
            if(StringUtil.isNotEmpty(item.getAccountNonExpired()))
                dto.setAccountNonExpired(item.getAccountNonExpired());
            if(StringUtil.isNotEmpty(item.getAccountNonLocked()))
                dto.setAccountNonLocked(item.getAccountNonLocked());
            if(StringUtil.isNotEmpty(item.getPasswordChanged()))
                dto.setPasswordChanged(item.getPasswordChanged());
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());


        return dto;
        }
    }




    public void initObject(boolean value) {
    }


}
