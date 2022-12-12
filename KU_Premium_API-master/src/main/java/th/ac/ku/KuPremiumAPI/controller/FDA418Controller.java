package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.FDA416;
import th.ac.ku.KuPremiumAPI.model.FDA418;
import th.ac.ku.KuPremiumAPI.service.FDA416Service;
import th.ac.ku.KuPremiumAPI.service.FDA418Service;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fda418")
public class FDA418Controller {

    @Autowired
    private FDA418Service service;

    @GetMapping
    public List<FDA418> getAll(){return service.getAll(); }

    @PostMapping
    public FDA418 create(@RequestBody FDA418 fda418){
        return service.create(fda418);
    }

    @GetMapping("/{id}")
    public FDA418 getFDA416(@PathVariable UUID id){
        return service.getFDA418(id);
    }

    @PutMapping("/{id}")
    public FDA418 update(@PathVariable UUID id, @RequestBody FDA418 fda418){
        return service.update(id, fda418);
    }

    @DeleteMapping("/{id}")
    public FDA418 delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
