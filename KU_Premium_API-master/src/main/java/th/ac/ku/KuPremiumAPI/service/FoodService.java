package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Food;
import th.ac.ku.KuPremiumAPI.model.Story;
import th.ac.ku.KuPremiumAPI.repository.FoodRepository;
import th.ac.ku.KuPremiumAPI.repository.StoryRepository;

import java.util.List;
import java.util.UUID;

@Service
public class FoodService {
    @Autowired
    private FoodRepository repository;

    public List<Food> getAll(){
        return repository.findAll();
    }

    public Food create(Food food){
        repository.save(food);
        return food;
    }
    public Food getFood(UUID id){
        return repository.findById(id).get();
    }

    public Food update(UUID id, Food requestBody){
        Food record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProdFoodName(requestBody.getProdFoodName());

        repository.save(record);
        return record;
    }

    public Food delete(UUID id){
        Food record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
