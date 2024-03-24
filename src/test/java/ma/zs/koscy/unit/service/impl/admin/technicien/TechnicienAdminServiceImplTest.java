package ma.zs.koscy.unit.service.impl.admin.technicien;

import ma.zs.koscy.bean.core.technicien.Technicien;
import ma.zs.koscy.dao.facade.core.technicien.TechnicienDao;
import ma.zs.koscy.service.impl.admin.technicien.TechnicienAdminServiceImpl;

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
class TechnicienAdminServiceImplTest {

    @Mock
    private TechnicienDao repository;
    private AutoCloseable autoCloseable;
    private TechnicienAdminServiceImpl underTest;



    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new TechnicienAdminServiceImpl(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllTechnicien() {
         //when
        underTest.findAll();
        verify(repository).findAll();
    }

    @Test
    void itShouldSaveTechnicien() {
        // Given
        Technicien toSave = constructSample(1);
        when(repository.save(toSave)).thenReturn(toSave);

        // When
        underTest.create(toSave);

        // Then
        verify(repository).save(toSave);
    }

    @Test
    void itShouldDeleteTechnicien() {
        // Given
        Long idToDelete = 1L;
        when(repository.existsById(idToDelete)).thenReturn(true);

        // When
        underTest.deleteById(idToDelete);

        // Then
        verify(repository).deleteById(idToDelete);
    }
    @Test
    void itShouldGetTechnicienById() {
        // Given
        Long idToRetrieve = 1L; // Example Technicien ID to retrieve
        Technicien expected = new Technicien(); // You need to replace Technicien with your actual class
        expected.setId(idToRetrieve);
        when(repository.findById(idToRetrieve)).thenReturn(java.util.Optional.of(expected));

        // When
        Technicien result = underTest.findById(idToRetrieve);

        // Then
        assertEquals(expected, result);
    }
	
	private Technicien constructSample(int i) {
		Technicien given = new Technicien();
        given.setId(id);
        given.setCin("cin-"+i);
        given.setCin(cin);
        given.setCredentialsNonExpired(false);
        given.setCredentialsNonExpired(credentialsNonExpired);
        given.setEnabled(false);
        given.setEnabled(enabled);
        given.setAccountNonExpired(false);
        given.setAccountNonExpired(accountNonExpired);
        given.setAccountNonLocked(false);
        given.setAccountNonLocked(accountNonLocked);
        given.setPasswordChanged(false);
        given.setPasswordChanged(passwordChanged);
        given.setUsername("username-"+i);
        given.setUsername(username);
        given.setPassword("password-"+i);
        given.setPassword(password);
        return given;
    }

}
