package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Audio;
import th.ac.ku.KuPremiumAPI.model.Food;
import th.ac.ku.KuPremiumAPI.service.AudioService;
import th.ac.ku.KuPremiumAPI.service.FoodService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/audio")
public class AudioController {

    @Autowired
    private AudioService service;

    @GetMapping
    public List<Audio> getAll(){return service.getAll(); }

    @PostMapping
    public Audio create(@RequestBody Audio audio){
        return service.create(audio);
    }

    @GetMapping("/{id}")
    public Audio getAudio(@PathVariable UUID id){
        return service.getAudio(id);
    }

    @PutMapping("/{id}")
    public Audio update(@PathVariable UUID id, @RequestBody Audio audio){
        return service.update(id, audio);
    }

    @DeleteMapping("/{id}")
    public Audio delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
