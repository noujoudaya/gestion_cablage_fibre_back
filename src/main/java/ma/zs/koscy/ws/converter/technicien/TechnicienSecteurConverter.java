package ma.zs.koscy.ws.converter.technicien;

import ma.zs.koscy.bean.core.technicien.TechnicienSecteur;
import ma.zs.koscy.ws.dto.technicien.TechnicienSecteurDto;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.StringUtil;
import org.springframework.stereotype.Component;

@Component
public class TechnicienSecteurConverter extends AbstractConverter<TechnicienSecteur, TechnicienSecteurDto> {
    public  TechnicienSecteurConverter() {
        super(TechnicienSecteur.class, TechnicienSecteurDto.class);
    }

    @Override
    public TechnicienSecteur toItem(TechnicienSecteurDto dto) {
        if (dto == null) {
            return null;
        } else {
            TechnicienSecteur item = new TechnicienSecteur();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getDateDebut() != null )
                item.setDateDebut(dto.getDateDebut());
            if(dto.getDateFin() != null)
                item.setDateFin(dto.getDateFin());
            if(dto.getSecteur() != null)
                item.setSecteur(dto.getSecteur());
            if(dto.getTechnicien() != null)
                item.setTechnicien(dto.getTechnicien());

            return item;
        }
    }

    @Override
    public TechnicienSecteurDto toDto(TechnicienSecteur item) {
        if (item == null) {
            return null;
        } else {
            TechnicienSecteurDto dto = new TechnicienSecteurDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateDebut() != null)
                dto.setDateDebut(item.getDateDebut());
            if(item.getDateFin() != null)
                dto.setDateFin(item.getDateFin());
            if(item.getSecteur()!=null)
                dto.setSecteur(item.getSecteur());
            if(item.getTechnicien()!=null)
                dto.setTechnicien(item.getTechnicien());

            return dto;
        }
    }

    public void copy(TechnicienSecteurDto dto, TechnicienSecteur t) {
        super.copy(dto, t);
    }
}
