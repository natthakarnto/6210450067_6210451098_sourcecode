package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.FDA365;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import th.ac.ku.KuPremiumAPI.service.FDA365Service;
import th.ac.ku.KuPremiumAPI.service.FDA414Service;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fda414")
public class FDA414Controller {
    @Autowired
    private FDA414Service service;

    @GetMapping
    public List<FDA414> getAll(){return service.getAll(); }

    @PostMapping
    public FDA414 create(@RequestBody FDA414 fda414){
        return service.create(fda414);
    }

    @GetMapping("/{id}")
    public FDA414 getFDA414(@PathVariable UUID id){
        return service.getFDA414(id);
    }

    @PutMapping("/{id}")
    public FDA414 update(@PathVariable UUID id, @RequestBody FDA414 fda414){
        return service.update(id, fda414);
    }

    @DeleteMapping("/{id}")
    public FDA414 delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
