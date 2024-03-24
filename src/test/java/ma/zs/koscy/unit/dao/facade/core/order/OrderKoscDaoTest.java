package ma.zs.koscy.unit.dao.facade.core.order;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.dao.facade.core.order.OrderKoscDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.time.LocalDateTime;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class OrderKoscDaoTest {

@Autowired
    private OrderKoscDao underTest;

    @Test
    void shouldFindByCode(){
        String code = "code-1";
        OrderKosc entity = new OrderKosc();
        entity.setCode(code);
        underTest.save(entity);
        OrderKosc loaded = underTest.findByCode(code);
        assertThat(loaded.getCode()).isEqualTo(code);
    }

    @Test
    void shouldDeleteByCode() {
        String code = "code-1";
        OrderKosc entity = new OrderKosc();
        entity.setCode(code);
        underTest.save(entity);

        int result = underTest.deleteByCode(code);

        OrderKosc loaded = underTest.findByCode(code);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        OrderKosc entity = new OrderKosc();
        entity.setId(id);
        underTest.save(entity);
        OrderKosc loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        OrderKosc entity = new OrderKosc();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        OrderKosc loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<OrderKosc> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<OrderKosc> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        OrderKosc given = constructSample(1);
        OrderKosc saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private OrderKosc constructSample(int i) {
		OrderKosc given = new OrderKosc();
        given.setCode("code-"+i);
        given.setLibelle("libelle-"+i);
        given.setDateRdv(LocalDateTime.now());
        given.setReasonKo(new ReasonKo(1L));
        return given;
    }

}
