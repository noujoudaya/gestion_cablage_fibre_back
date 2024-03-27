package ma.zs.koscy.ws.facade.admin.template;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


import ma.zs.koscy.bean.core.template.TemplateConfirmationRdv;
import ma.zs.koscy.dao.criteria.core.template.TemplateConfirmationRdvCriteria;
import ma.zs.koscy.service.facade.admin.template.TemplateConfirmationRdvAdminService;
import ma.zs.koscy.ws.converter.template.TemplateConfirmationRdvConverter;
import ma.zs.koscy.ws.dto.template.TemplateConfirmationRdvDto;
import ma.zs.koscy.zynerator.controller.AbstractController;
import ma.zs.koscy.zynerator.dto.FileTempDto;
import ma.zs.koscy.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;



import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/admin/TemplateConfirmationRdv/")
public class TemplateConfirmationRdvRestAdmin  extends AbstractController<TemplateConfirmationRdv, TemplateConfirmationRdvDto, TemplateConfirmationRdvCriteria, TemplateConfirmationRdvAdminService, TemplateConfirmationRdvConverter> {



    @Operation(summary = "upload one TemplateConfirmationRdv")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple TemplateConfirmationRdvs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all TemplateConfirmationRdvs")
    @GetMapping("")
    public ResponseEntity<List<TemplateConfirmationRdvDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all TemplateConfirmationRdvs")
    @GetMapping("optimized")
    public ResponseEntity<List<TemplateConfirmationRdvDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a TemplateConfirmationRdv by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<TemplateConfirmationRdvDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new TemplateConfirmationRdv(libelle));
    }

    @Operation(summary = "Saves the specified  TemplateConfirmationRdv")
    @PostMapping("")
    public ResponseEntity<TemplateConfirmationRdvDto> save(@RequestBody TemplateConfirmationRdvDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  TemplateConfirmationRdv")
    @PutMapping("")
    public ResponseEntity<TemplateConfirmationRdvDto> update(@RequestBody TemplateConfirmationRdvDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of TemplateConfirmationRdv")
    @PostMapping("multiple")
    public ResponseEntity<List<TemplateConfirmationRdvDto>> delete(@RequestBody List<TemplateConfirmationRdvDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified TemplateConfirmationRdv")
    @DeleteMapping("")
    public ResponseEntity<TemplateConfirmationRdvDto> delete(@RequestBody TemplateConfirmationRdvDto dto) throws Exception {
        return super.delete(dto);
    }

    @Operation(summary = "Delete the specified TemplateConfirmationRdv")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple TemplateConfirmationRdvs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }



    @Operation(summary = "Finds a TemplateConfirmationRdv and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TemplateConfirmationRdvDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds TemplateConfirmationRdvs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TemplateConfirmationRdvDto>> findByCriteria(@RequestBody TemplateConfirmationRdvCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated TemplateConfirmationRdvs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TemplateConfirmationRdvCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports TemplateConfirmationRdvs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TemplateConfirmationRdvCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets TemplateConfirmationRdv data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TemplateConfirmationRdvCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TemplateConfirmationRdvRestAdmin (TemplateConfirmationRdvAdminService service, TemplateConfirmationRdvConverter converter) {
        super(service, converter);
    }




}
