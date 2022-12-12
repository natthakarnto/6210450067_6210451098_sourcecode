package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.FDA418;
import th.ac.ku.KuPremiumAPI.model.Inspection;
import th.ac.ku.KuPremiumAPI.service.FDA418Service;
import th.ac.ku.KuPremiumAPI.service.InspectionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/inspection")
public class InspectionController {

    @Autowired
    private InspectionService inspectionService;

    @GetMapping
    public List<Inspection> getAll(){return inspectionService.getAll(); }

    @PostMapping
    public Inspection create(@RequestBody Inspection inspection){
        return inspectionService.create(inspection);
    }

    @GetMapping("/{id}")
    public Inspection getInspection(@PathVariable UUID id){
        return inspectionService.getInspection(id);
    }

    @PutMapping("/{id}")
    public Inspection update(@PathVariable UUID id, @RequestBody Inspection inspection){
        return inspectionService.update(id, inspection);
    }

    @DeleteMapping("/{id}")
    public Inspection delete(@PathVariable UUID id){
        return inspectionService.delete(id);
    }
}
