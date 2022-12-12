package th.ac.ku.KuPremiumAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.KuPremiumAPI.model.Food;
import th.ac.ku.KuPremiumAPI.model.Research;
import th.ac.ku.KuPremiumAPI.service.FoodService;
import th.ac.ku.KuPremiumAPI.service.ResearchService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService service;

    @GetMapping
    public List<Food> getAll(){return service.getAll(); }

    @PostMapping
    public Food create(@RequestBody Food food){
        return service.create(food);
    }

    @GetMapping("/{id}")
    public Food getFood(@PathVariable UUID id){
        return service.getFood(id);
    }

    @PutMapping("/{id}")
    public Food update(@PathVariable UUID id, @RequestBody Food food){
        return service.update(id, food);
    }

    @DeleteMapping("/{id}")
    public Food delete(@PathVariable UUID id){
        return service.delete(id);
    }
}
