package ma.zs.koscy.unit.ws.facade.admin.commun;

import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.service.impl.admin.commun.ReasonKoAdminServiceImpl;
import ma.zs.koscy.ws.converter.commun.ReasonKoConverter;
import ma.zs.koscy.ws.dto.commun.ReasonKoDto;
import ma.zs.koscy.ws.facade.admin.commun.ReasonKoRestAdmin;
import org.aspectj.lang.annotation.Before;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ReasonKoRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private ReasonKoAdminServiceImpl service;
    @Mock
    private ReasonKoConverter converter;

    @InjectMocks
    private ReasonKoRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllReasonKoTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<ReasonKoDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<ReasonKoDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveReasonKoTest() throws Exception {
        // Mock data
        ReasonKoDto requestDto = new ReasonKoDto();
        ReasonKo entity = new ReasonKo();
        ReasonKo saved = new ReasonKo();
        ReasonKoDto savedDto = new ReasonKoDto();

        // Mock the converter to return the reasonKo object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved reasonKo DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<ReasonKoDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        ReasonKoDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved reasonKo DTO
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getLibelle(), responseBody.getLibelle());
        assertEquals(savedDto.getReasons(), responseBody.getReasons());
        assertEquals(savedDto.getDescription(), responseBody.getDescription());
    }

}
