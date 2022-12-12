package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.FDA365;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import th.ac.ku.KuPremiumAPI.repository.FDA365Repository;
import th.ac.ku.KuPremiumAPI.repository.FDA414Repository;

import java.util.List;
import java.util.UUID;

@Service
public class FDA414Service {
    @Autowired
    private FDA414Repository repository;

    public List<FDA414> getAll(){
        return repository.findAll();
    }

    public FDA414 create(FDA414 fda414){
        repository.save(fda414);
        return fda414;
    }

    public FDA414 getFDA414(UUID id){
        return repository.findById(id).get();
    }

    public FDA414 update(UUID id, FDA414 requestBody){
        FDA414 record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setR_name(requestBody.getR_name());
        record.setLead_s(requestBody.getLead_s());
        record.setLead_c(requestBody.getLead_c());
        record.setLead_f(requestBody.getLead_f());

        repository.save(record);
        return record;
    }

    public FDA414 delete(UUID id){
        FDA414 record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
