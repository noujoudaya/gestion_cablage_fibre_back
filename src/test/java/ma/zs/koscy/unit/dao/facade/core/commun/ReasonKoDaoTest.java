package ma.zs.koscy.unit.dao.facade.core.commun;

import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.dao.facade.core.commun.ReasonKoDao;

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
public class ReasonKoDaoTest {

@Autowired
    private ReasonKoDao underTest;


    @Test
    void shouldFindById(){
        Long id = 1L;
        ReasonKo entity = new ReasonKo();
        entity.setId(id);
        underTest.save(entity);
        ReasonKo loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        ReasonKo entity = new ReasonKo();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        ReasonKo loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<ReasonKo> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<ReasonKo> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        ReasonKo given = constructSample(1);
        ReasonKo saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private ReasonKo constructSample(int i) {
		ReasonKo given = new ReasonKo();
        given.setCode("code-"+i);
        given.setLibelle("libelle-"+i);
        given.setReasons("reasons-"+i);
        given.setDescription("description-"+i);
        return given;
    }

}
