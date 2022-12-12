package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Audit;
import th.ac.ku.KuPremiumAPI.model.Inspection;
import th.ac.ku.KuPremiumAPI.service.AuditService;
import th.ac.ku.KuPremiumAPI.service.InspectionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private AuditService auditService;

    @GetMapping
    public List<Audit> getAll(){return auditService.getAll(); }

    @PostMapping
    public Audit create(@RequestBody Audit audit){
        return auditService.create(audit);
    }

    @GetMapping("/{id}")
    public Audit getAudit(@PathVariable UUID id){
        return auditService.getAudit(id);
    }

    @PutMapping("/{id}")
    public Audit update(@PathVariable UUID id, @RequestBody Audit audit){
        return auditService.update(id, audit);
    }

    @DeleteMapping("/{id}")
    public Audit delete(@PathVariable UUID id){
        return auditService.delete(id);
    }
}
