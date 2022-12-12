package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.service.CertificateService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @GetMapping
    public List<Certificate> getAll(){return service.getAll(); }

    @PostMapping
    public Certificate create(@RequestBody Certificate certificate){
        return service.create(certificate);
    }

    @GetMapping("/{id}")
    public Certificate getCertificate(@PathVariable UUID id){
        return service.getCertificate(id);
    }

    @PutMapping("/{id}")
    public Certificate update(@PathVariable UUID id, @RequestBody Certificate certificate){
        return service.update(id, certificate);
    }

    @DeleteMapping("/{id}")
    public Certificate delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
