package th.ac.ku.KuPremiumAPI.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Cakes;
import th.ac.ku.KuPremiumAPI.repository.CakesRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CakesService {

    @Autowired
    private CakesRepository repository;

    public List<Cakes> getAll(){
        return repository.findAll();
    }

    public Cakes create(Cakes cakes){
        repository.save(cakes);
        return cakes;
    }

    public Cakes getCakes(UUID id){
        return repository.findById(id).get();
    }

    public Cakes update(UUID id, Cakes requestBody){
        Cakes record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setUsername(requestBody.getUsername());
        record.setProductCategory(requestBody.getProductCategory());
        record.setPrice(requestBody.getPrice());
        record.setPoID(requestBody.getPoID());
        record.setProductDescription(requestBody.getProductDescription());
        record.setProductAttrib(requestBody.getProductAttrib());
        record.setProductUsageGuideline(requestBody.getProductUsageGuideline());
        record.setProductIngredients(requestBody.getProductIngredients());
        record.setProductNutrition(requestBody.getProductNutrition());
        record.setProductUseIndication(requestBody.getProductUseIndication());
        record.setProductQuantity(requestBody.getProductQuantity());
        record.setProductSize(requestBody.getProductSize());
        record.setProductVolume(requestBody.getProductVolume());
        record.setProductWeight(requestBody.getProductWeight());
        record.setProductPromotion(requestBody.getProductPromotion());
        record.setProductDiscountPercent(requestBody.getProductDiscountPercent());
        record.setPriceExcludingVat(requestBody.getPriceExcludingVat());
        record.setPricePromotion(requestBody.getPricePromotion());
//        record.setPcID(record.getPcID());
//        record.setPrr_ID(record.getPrr_ID());
//        record.setPsvID(record.getPsvID());
//        record.setFtvID(record.getFtvID());
//        record.setaID(record.getaID());
//        record.setRreID(record.getRreID());

        repository.save(record);
        return record;
    }


    public Cakes delete(UUID id){
        Cakes record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
