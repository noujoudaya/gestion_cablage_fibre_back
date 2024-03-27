package ma.zs.koscy.ws.facade.admin.template;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import ma.zs.univ.bean.core.technicien.Technicien;
import ma.zs.univ.dao.criteria.core.technicien.TechnicienCriteria;
import ma.zs.univ.service.facade.admin.technicien.TechnicienAdminService;
import ma.zs.univ.ws.converter.technicien.TechnicienConverter;
import ma.zs.univ.ws.dto.technicien.TechnicienDto;
import ma.zs.univ.zynerator.controller.AbstractController;
import ma.zs.univ.zynerator.dto.AuditEntityDto;
import ma.zs.univ.zynerator.util.PaginatedList;


import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.zs.univ.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.zs.univ.zynerator.dto.FileTempDto;

@RestController
@RequestMapping("/api/admin/technicien/")
public class TechnicienRestAdmin  extends AbstractController<Technicien, TechnicienDto, TechnicienCriteria, TechnicienAdminService, TechnicienConverter> {



    @Operation(summary = "upload one technicien")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @Operation(summary = "upload multiple techniciens")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @Operation(summary = "Finds a list of all techniciens")
    @GetMapping("")
    public ResponseEntity<List<TechnicienDto>> findAll() throws Exception {
        return super.findAll();
    }

    @Operation(summary = "Finds an optimized list of all techniciens")
    @GetMapping("optimized")
    public ResponseEntity<List<TechnicienDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @Operation(summary = "Finds a technicien by nom")
    @GetMapping("nom/{nom}")
    public ResponseEntity<TechnicienDto> findByNom(@PathVariable String nom) {
        return super.findByReferenceEntity(new Technicien(nom));
    }

    @Operation(summary = "Saves the specified  technicien")
    @PostMapping("")
    public ResponseEntity<TechnicienDto> save(@RequestBody TechnicienDto dto) throws Exception {
        return super.save(dto);
    }

    @Operation(summary = "Updates the specified  technicien")
    @PutMapping("")
    public ResponseEntity<TechnicienDto> update(@RequestBody TechnicienDto dto) throws Exception {
        return super.update(dto);
    }

    @Operation(summary = "Delete list of technicien")
    @PostMapping("multiple")
    public ResponseEntity<List<TechnicienDto>> delete(@RequestBody List<TechnicienDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @Operation(summary = "Delete the specified technicien")
    @DeleteMapping("")
    public ResponseEntity<TechnicienDto> delete(@RequestBody TechnicienDto dto) throws Exception {
        return super.delete(dto);
    }

    @Operation(summary = "Delete the specified technicien")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @Operation(summary = "Delete multiple techniciens by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
        return super.deleteByIdIn(ids);
    }



    @Operation(summary = "Finds a technicien and associated list by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TechnicienDto> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Operation(summary = "Finds techniciens by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TechnicienDto>> findByCriteria(@RequestBody TechnicienCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @Operation(summary = "Finds paginated techniciens by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TechnicienCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @Operation(summary = "Exports techniciens by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TechnicienCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @Operation(summary = "Gets technicien data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TechnicienCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }



    public TechnicienRestAdmin (TechnicienAdminService service, TechnicienConverter converter) {
        super(service, converter);
    }




}
