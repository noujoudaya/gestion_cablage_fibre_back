package ma.zs.koscy.unit.service.impl.admin.commun;

import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.dao.facade.core.commun.ReasonKoDao;
import ma.zs.koscy.service.impl.admin.commun.ReasonKoAdminServiceImpl;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDateTime;



import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class ReasonKoAdminServiceImplTest {

    @Mock
    private ReasonKoDao repository;
    private AutoCloseable autoCloseable;
    private ReasonKoAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new ReasonKoAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllReasonKo() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveReasonKo() {
        // Given
        ReasonKo toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteReasonKo() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetReasonKoById() {
        // Given
        Long idToRetrieve = 1L; // Example ReasonKo ID to retrieve
        ReasonKo expected = new ReasonKo(); // You need to replace ReasonKo with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        ReasonKo result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private ReasonKo constructSample(int i) {
		ReasonKo given = new ReasonKo();
        given.setId(id);
        given.setCode("code-"+i);
        given.setCode(code);
        given.setLibelle("libelle-"+i);
        given.setLibelle(libelle);
        given.setReasons("reasons-"+i);
        given.setReasons(reasons);
        given.setDescription("description-"+i);
        given.setDescription(description);
        return given;
    }

}
