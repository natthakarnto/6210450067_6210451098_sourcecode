package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import th.ac.ku.KuPremiumAPI.model.FDA416;
import th.ac.ku.KuPremiumAPI.repository.FDA414Repository;
import th.ac.ku.KuPremiumAPI.repository.FDA416Repository;

import java.util.List;
import java.util.UUID;

@Service
public class FDA416Service {
    @Autowired
    private FDA416Repository repository;

    public List<FDA416> getAll(){
        return repository.findAll();
    }

    public FDA416 create(FDA416 fda416){
        repository.save(fda416);
        return fda416;
    }

    public FDA416 getFDA416(UUID id){
        return repository.findById(id).get();
    }

    public FDA416 update(UUID id, FDA416 requestBody){
        FDA416 record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setR_name(requestBody.getR_name());
        record.setSalla_s(requestBody.getSalla_s());
        record.setSalla_c(requestBody.getSalla_c());
        record.setSalla_f(requestBody.getSalla_f());
        record.setSareus_s(requestBody.getSareus_s());
        record.setSareus_c(requestBody.getSareus_c());
        record.setSareus_f(requestBody.getSareus_f());


        repository.save(record);
        return record;
    }

    public FDA416 delete(UUID id){
        FDA416 record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
