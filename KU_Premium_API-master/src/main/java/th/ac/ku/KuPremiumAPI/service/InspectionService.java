package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.FDA418;
import th.ac.ku.KuPremiumAPI.model.Inspection;
import th.ac.ku.KuPremiumAPI.repository.FDA418Repository;
import th.ac.ku.KuPremiumAPI.repository.InspectionRepository;

import java.util.List;
import java.util.UUID;

@Service
public class InspectionService {

    @Autowired
    private InspectionRepository repository;

    public List<Inspection> getAll(){
        return repository.findAll();
    }

    public Inspection create(Inspection inspection){
        repository.save(inspection);
        return inspection;
    }

    public Inspection getInspection(UUID id){
        return repository.findById(id).get();
    }

    public Inspection update(UUID id, Inspection requestBody){
        Inspection record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProductName(requestBody.getProductName());
        record.setSent_Date(requestBody.getSent_Date());
        record.setR_Name(requestBody.getR_Name());
        record.setR_Rank(requestBody.getR_Rank());
        record.setNote(requestBody.getNote());
        record.setStatus(requestBody.getStatus());

        repository.save(record);
        return record;
    }

    public Inspection delete(UUID id){
        Inspection record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
