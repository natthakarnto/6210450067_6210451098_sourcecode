package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import th.ac.ku.KuPremiumAPI.model.FDA416;
import th.ac.ku.KuPremiumAPI.service.FDA414Service;
import th.ac.ku.KuPremiumAPI.service.FDA416Service;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fda416")
public class FDA416Controller {

    @Autowired
    private FDA416Service service;

    @GetMapping
    public List<FDA416> getAll(){return service.getAll(); }

    @PostMapping
    public FDA416 create(@RequestBody FDA416 fda416){
        return service.create(fda416);
    }

    @GetMapping("/{id}")
    public FDA416 getFDA416(@PathVariable UUID id){
        return service.getFDA416(id);
    }

    @PutMapping("/{id}")
    public FDA416 update(@PathVariable UUID id, @RequestBody FDA416 fda416){
        return service.update(id, fda416);
    }

    @DeleteMapping("/{id}")
    public FDA416 delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
