//package ma.zs.koscy.ws.converter.commun;
//
//import ma.zs.koscy.bean.core.commun.Provider;
//import ma.zs.koscy.bean.core.commun.Provider;
//import ma.zs.koscy.ws.dto.commun.ProviderDto;
//import ma.zs.koscy.ws.dto.commun.ProviderDto;
//import ma.zs.koscy.zynerator.converter.AbstractConverter;
//import ma.zs.koscy.zynerator.util.StringUtil;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ProviderConverter extends AbstractConverter<Provider, ProviderDto> {
//
//
//    public ProviderConverter() {
//        super(Provider.class, ProviderDto.class);
//    }
//
//    @Override
//    public Provider toItem(ProviderDto dto) {
//        if (dto == null) {
//            return null;
//        } else {
//            Provider item = new Provider();
//            if (StringUtil.isNotEmpty(dto.getId()))
//                item.setId(dto.getId());
//            if (StringUtil.isNotEmpty(dto.getIdComentreprise()))
//                item.setIdComentreprise(dto.getIdComentreprise());
//            if (StringUtil.isNotEmpty(dto.getRaisonSocial()))
//                item.setRaisonSocial(dto.getRaisonSocial());
//            if (StringUtil.isNotEmpty(dto.getIdentifiantFiscal()))
//                item.setIdentifiantFiscal(dto.getIdentifiantFiscal());
//            return item;
//        }
//    }
//
//    @Override
//    public ProviderDto toDto(Provider item) {
//        if (item == null) {
//            return null;
//        } else {
//            ProviderDto dto = new ProviderDto();
//            if (StringUtil.isNotEmpty(item.getId()))
//                dto.setId(item.getId());
//            if (StringUtil.isNotEmpty(item.getIdComentreprise()))
//                dto.setIdComentreprise(item.getIdComentreprise());
//            if (StringUtil.isNotEmpty(item.getRaisonSocial()))
//                dto.setRaisonSocial(item.getRaisonSocial());
//            if (StringUtil.isNotEmpty(item.getIdentifiantFiscal()))
//            dto.setIdentifiantFiscal(item.getIdentifiantFiscal());
//
//            return dto;
//        }
//    }
//
//    public void initObject(boolean value) {
//    }
//
//
//}
