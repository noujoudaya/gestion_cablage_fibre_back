package  ma.zs.koscy.ws.facade.admin.commun;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.koscy.bean.core.commun.ReasonKo;
import ma.zs.koscy.dao.criteria.core.commun.ReasonKoCriteria;
import ma.zs.koscy.service.facade.admin.commun.ReasonKoAdminService;
import ma.zs.koscy.ws.converter.commun.ReasonKoConverter;
import ma.zs.koscy.ws.dto.commun.ReasonKoDto;
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
@RequestMapping("/api/admin/reasonKo/")
public class ReasonKoRestAdmin  extends AbstractController<ReasonKo, ReasonKoDto, ReasonKoCriteria, ReasonKoAdminService, ReasonKoConverter> {



    @Operation(summary = "upload one reasonKo")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple reasonKos")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all reasonKos")
    @GetMapping("")
    public ResponseEntity<List<ReasonKoDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all reasonKos")
    @GetMapping("optimized")
    public ResponseEntity<List<ReasonKoDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a reasonKo by libelle")
    @GetMapping("libelle/{libelle}")
    public ResponseEntity<ReasonKoDto> findByLibelle(@PathVariable String libelle) {
        return super.findByReferenceEntity(new ReasonKo(libelle));
    }

    @Operation(summary = "Saves the specified  reasonKo")
    @PostMapping("")
    public ResponseEntity<ReasonKoDto> save(@RequestBody ReasonKoDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  reasonKo")
    @PutMapping("")
    public ResponseEntity<ReasonKoDto> update(@RequestBody ReasonKoDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of reasonKo")
    @PostMapping("multiple")
    public ResponseEntity<List<ReasonKoDto>> delete(@RequestBody List<ReasonKoDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified reasonKo")
    @DeleteMapping("")
    public ResponseEntity<ReasonKoDto> delete(@RequestBody ReasonKoDto dto) throws Exception {
            return super.delete(dto);
    }

    @Operation(summary = "Delete the specified reasonKo")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple reasonKos by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }



    @Operation(summary = "Finds a reasonKo and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReasonKoDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds reasonKos by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReasonKoDto>> findByCriteria(@RequestBody ReasonKoCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated reasonKos by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReasonKoCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports reasonKos by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReasonKoCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets reasonKo data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReasonKoCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public ReasonKoRestAdmin (ReasonKoAdminService service, ReasonKoConverter converter) {
        super(service, converter);
    }




}
