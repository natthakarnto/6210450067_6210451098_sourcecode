package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.Research;
import th.ac.ku.KuPremiumAPI.service.CertificateService;
import th.ac.ku.KuPremiumAPI.service.ResearchService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/research")
public class ResearchController {

    @Autowired
    private ResearchService service;

    @GetMapping
    public List<Research> getAll(){return service.getAll(); }

    @PostMapping
    public Research create(@RequestBody Research research){
        return service.create(research);
    }

    @GetMapping("/{id}")
    public Research getResearch(@PathVariable UUID id){
        return service.getResearch(id);
    }

    @PutMapping("/{id}")
    public Research update(@PathVariable UUID id, @RequestBody Research research){
        return service.update(id, research);
    }

    @DeleteMapping("/{id}")
    public Research delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
