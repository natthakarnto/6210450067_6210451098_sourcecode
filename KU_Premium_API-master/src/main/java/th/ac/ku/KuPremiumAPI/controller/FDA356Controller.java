package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.FDA365;
import th.ac.ku.KuPremiumAPI.service.CertificateService;
import th.ac.ku.KuPremiumAPI.service.FDA365Service;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fda356")
public class FDA356Controller {

    @Autowired
    private FDA365Service service;

    @GetMapping
    public List<FDA365> getAll(){return service.getAll(); }

    @PostMapping
    public FDA365 create(@RequestBody FDA365 fda365){
        return service.create(fda365);
    }

    @GetMapping("/{id}")
    public FDA365 getFDA365(@PathVariable UUID id){
        return service.getFDA365(id);
    }

    @PutMapping("/{id}")
    public FDA365 update(@PathVariable UUID id, @RequestBody FDA365 fda365){
        return service.update(id, fda365);
    }

    @DeleteMapping("/{id}")
    public FDA365 delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
