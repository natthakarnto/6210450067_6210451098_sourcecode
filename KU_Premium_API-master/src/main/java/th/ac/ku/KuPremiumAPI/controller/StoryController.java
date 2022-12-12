package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Research;
import th.ac.ku.KuPremiumAPI.model.Story;
import th.ac.ku.KuPremiumAPI.service.ResearchService;
import th.ac.ku.KuPremiumAPI.service.StoryService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/story")
public class StoryController {
    @Autowired
    private StoryService service;

    @GetMapping
    public List<Story> getAll(){return service.getAll(); }

    @PostMapping
    public Story create(@RequestBody Story story){
        return service.create(story);
    }

    @GetMapping("/{id}")
    public Story getResearch(@PathVariable UUID id){
        return service.getStory(id);
    }

    @PutMapping("/{id}")
    public Story update(@PathVariable UUID id, @RequestBody Story story){
        return service.update(id, story);
    }

    @DeleteMapping("/{id}")
    public Story delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
