package  ma.zs.koscy.ws.converter.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.zs.koscy.ws.converter.commun.ReasonKoConverter;



import ma.zs.koscy.zynerator.util.StringUtil;
import ma.zs.koscy.zynerator.converter.AbstractConverter;
import ma.zs.koscy.zynerator.util.DateUtil;
import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.ws.dto.order.OrderKoscDto;

@Component
public class OrderKoscConverter extends AbstractConverter<OrderKosc, OrderKoscDto> {

    @Autowired
    private ReasonKoConverter reasonKoConverter ;
    private boolean reasonKo;

    public  OrderKoscConverter() {
        super(OrderKosc.class, OrderKoscDto.class);
        init(true);
    }

    @Override
    public OrderKosc toItem(OrderKoscDto dto) {
        if (dto == null) {
            return null;
        } else {
        OrderKosc item = new OrderKosc();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateRdv()))
                item.setDateRdv(DateUtil.stringEnToDate(dto.getDateRdv()));
            if(this.reasonKo && dto.getReasonKo()!=null &&  dto.getReasonKo().getId() != null)
                item.setReasonKo(reasonKoConverter.toItem(dto.getReasonKo())) ;




        return item;
        }
    }

    @Override
    public OrderKoscDto toDto(OrderKosc item) {
        if (item == null) {
            return null;
        } else {
            OrderKoscDto dto = new OrderKoscDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getDateRdv()!=null)
                dto.setDateRdv(DateUtil.dateTimeToString(item.getDateRdv()));
            if(this.reasonKo && item.getReasonKo()!=null) {
                dto.setReasonKo(reasonKoConverter.toDto(item.getReasonKo())) ;

            }


        return dto;
        }
    }

    public void copy(OrderKoscDto dto, OrderKosc t) {
    super.copy(dto, t);
    if (dto.getReasonKo() != null)
        reasonKoConverter.copy(dto.getReasonKo(), t.getReasonKo());
    }



    public void initObject(boolean value) {
        this.reasonKo = value;
    }


    public ReasonKoConverter getReasonKoConverter(){
        return this.reasonKoConverter;
    }
    public void setReasonKoConverter(ReasonKoConverter reasonKoConverter ){
        this.reasonKoConverter = reasonKoConverter;
    }
    public boolean  isReasonKo(){
        return this.reasonKo;
    }
    public void  setReasonKo(boolean reasonKo){
        this.reasonKo = reasonKo;
    }
}
