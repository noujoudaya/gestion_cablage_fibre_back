package ma.zs.koscy.unit.dao.facade.core.technicien;

import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.facade.core.technicien.TechnicienDao;

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
public class TechnicienDaoTest {

@Autowired
    private TechnicienDao underTest;

    @Test
    void shouldFindByCin(){
        String cin = "cin-1";
        Technicien entity = new Technicien();
        entity.setCin(cin);
        underTest.save(entity);
        Technicien loaded = underTest.findByCin(cin);
        assertThat(loaded.getCin()).isEqualTo(cin);
    }

    @Test
    void shouldDeleteByCin() {
        String cin = "cin-1";
        Technicien entity = new Technicien();
        entity.setCin(cin);
        underTest.save(entity);

        int result = underTest.deleteByCin(cin);

        Technicien loaded = underTest.findByCin(cin);
        assertThat(loaded).isNull();
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldFindById(){
        Long id = 1L;
        Technicien entity = new Technicien();
        entity.setId(id);
        underTest.save(entity);
        Technicien loaded = underTest.findById(id).get();
        assertThat(loaded.getId()).isEqualTo(id);
    }

    @Test
    void shoulDeleteById() {
        Long id = 1L;
        Technicien entity = new Technicien();
        entity.setId(id);
        underTest.save(entity);

        underTest.deleteById(id);

        Technicien loaded = underTest.findById(id).get();
        assertThat(loaded).isNull();
    }


    @Test
    void shouldFindAll() {
        // Given
        List<Technicien> items = IntStream.rangeClosed(1, 10).mapToObj(i->constructSample(i)).collect(Collectors.toList());

        // Init
        items.forEach(underTest::save);

        // When
        List<Technicien> loadedItems = underTest.findAll();

        // Then
        assertThat(loadedItems).isNotNull();
        assertThat(loadedItems.size()).isEqualTo(10);
    }
    @Test
    void shouldSave(){
        Technicien given = constructSample(1);
        Technicien saved = underTest.save(given);
        assertThat(saved.getId()).isNotNull();
    }

    private Technicien constructSample(int i) {
		Technicien given = new Technicien();
        given.setCin("cin-"+i);
        given.setCredentialsNonExpired(false);
        given.setEnabled(false);
        given.setAccountNonExpired(false);
        given.setAccountNonLocked(false);
        given.setPasswordChanged(false);
        given.setUsername("username-"+i);
        given.setPassword("password-"+i);
        return given;
    }

}
