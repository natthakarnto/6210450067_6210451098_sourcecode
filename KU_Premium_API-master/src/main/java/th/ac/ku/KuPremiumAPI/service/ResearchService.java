package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.Research;
import th.ac.ku.KuPremiumAPI.repository.CertificateRepository;
import th.ac.ku.KuPremiumAPI.repository.ResearchRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ResearchService {

    @Autowired
    private ResearchRepository repository;

    public List<Research> getAll(){
        return repository.findAll();
    }

    public Research create(Research research){
        repository.save(research);
        return research;
    }

    public Research getResearch(UUID id){
        return repository.findById(id).get();
    }

    public Research update(UUID id, Research requestBody){
        Research record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setRelatedResearchName(requestBody.getRelatedResearchName());

        repository.save(record);
        return record;
    }

    public Research delete(UUID id){
        Research record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
