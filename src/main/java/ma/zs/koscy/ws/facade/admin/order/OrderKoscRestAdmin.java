package  ma.zs.koscy.ws.facade.admin.order;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.koscy.bean.core.order.OrderKosc;
import ma.zs.koscy.dao.criteria.core.order.OrderKoscCriteria;
import ma.zs.koscy.service.facade.admin.order.OrderKoscAdminService;
import ma.zs.koscy.ws.converter.order.OrderKoscConverter;
import ma.zs.koscy.ws.dto.order.OrderKoscDto;
import ma.zs.koscy.zynerator.controller.AbstractController;
import ma.zs.koscy.zynerator.dto.AuditEntityDto;
import ma.zs.koscy.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.koscy.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.koscy.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/orderKosc/")
public class OrderKoscRestAdmin  extends AbstractController<OrderKosc, OrderKoscDto, OrderKoscCriteria, OrderKoscAdminService, OrderKoscConverter> {



    @Operation(summary = "upload one orderKosc")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple orderKoscs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all orderKoscs")
    @GetMapping("")
    public ResponseEntity<List<OrderKoscDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all orderKoscs")
    @GetMapping("optimized")
    public ResponseEntity<List<OrderKoscDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a orderKosc by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<OrderKoscDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new OrderKosc(libelle));
    }

    @Operation(summary = "Saves the specified  orderKosc")
    @PostMapping("")
    public ResponseEntity<OrderKoscDto> save(@RequestBody OrderKoscDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  orderKosc")
    @PutMapping("")
    public ResponseEntity<OrderKoscDto> update(@RequestBody OrderKoscDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of orderKosc")
    @PostMapping("multiple")
    public ResponseEntity<List<OrderKoscDto>> delete(@RequestBody List<OrderKoscDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified orderKosc")
    @DeleteMapping("")
    public ResponseEntity<OrderKoscDto> delete(@RequestBody OrderKoscDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified orderKosc")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple orderKoscs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @Operation(summary = "find by reasonKo id")
    @GetMapping("reasonKo/id/{id}")
    public List<OrderKoscDto> findByReasonKoId(@PathVariable Long id){
        return findDtos(service.findByReasonKoId(id));
    }
    @Operation(summary = "delete by reasonKo id")
    @DeleteMapping("reasonKo/id/{id}")
    public int deleteByReasonKoId(@PathVariable Long id){
        return service.deleteByReasonKoId(id);
    }

    @Operation(summary = "Finds a orderKosc and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OrderKoscDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds orderKoscs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<OrderKoscDto>> findByCriteria(@RequestBody OrderKoscCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated orderKoscs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OrderKoscCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports orderKoscs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody OrderKoscCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets orderKosc data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OrderKoscCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public OrderKoscRestAdmin (OrderKoscAdminService service, OrderKoscConverter converter) {
        super(service, converter);
    }




}
