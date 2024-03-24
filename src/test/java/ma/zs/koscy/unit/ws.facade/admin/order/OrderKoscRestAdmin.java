package ma.zs.koscy.unit.ws.facade.admin.order;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.service.impl.admin.order.OrderKoscAdminServiceImpl;
import ma.zs.koscy.ws.converter.order.OrderKoscConverter;
import ma.zs.koscy.ws.dto.order.OrderKoscDto;
import ma.zs.koscy.ws.facade.admin.order.OrderKoscRestAdmin;
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
public class OrderKoscRestAdmin {

    private MockMvc mockMvc;

    @Mock
    private OrderKoscAdminServiceImpl service;
    @Mock
    private OrderKoscConverter converter;

    @InjectMocks
    private OrderKoscRestAdmin controller;

    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }


    @Test
    public void itShouldFindAllOrderKoscTest() throws Exception {
        // Mock the service to return an empty list
        when(service.findAll()).thenReturn(Collections.emptyList());
        when(converter.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        // Call the controller method
        ResponseEntity<List<OrderKoscDto>> result = controller.findAll();

        // Verify the result
        assertEquals(HttpStatus.NO_CONTENT, result.getStatusCode());

        // Response body should be empty list
        List<OrderKoscDto> responseBody = result.getBody();
        assertNotNull(responseBody);
        assertEquals(0, responseBody.size());
    }

    @Test
    public void itShouldSaveOrderKoscTest() throws Exception {
        // Mock data
        OrderKoscDto requestDto = new OrderKoscDto();
        OrderKosc entity = new OrderKosc();
        OrderKosc saved = new OrderKosc();
        OrderKoscDto savedDto = new OrderKoscDto();

        // Mock the converter to return the orderKosc object when converting from DTO
        when(converter.toItem(requestDto)).thenReturn(entity);

        // Mock the service to return the saved client
        when(service.create(entity)).thenReturn(saved);

        // Mock the converter to return the saved orderKosc DTO
        when(converter.toDto(saved)).thenReturn(savedDto);

        // Call the controller method
        ResponseEntity<OrderKoscDto> result = controller.save(requestDto);

        // Verify the result
        assertEquals(HttpStatus.CREATED, result.getStatusCode());

        // Verify the response body
        OrderKoscDto responseBody = result.getBody();
        assertNotNull(responseBody);

        // Add assertions to compare the response body with the saved orderKosc DTO
        assertEquals(savedDto.getCode(), responseBody.getCode());
        assertEquals(savedDto.getLibelle(), responseBody.getLibelle());
        assertEquals(savedDto.getDateRdv(), responseBody.getDateRdv());
    }

}
