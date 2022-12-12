package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.FDA416;
import th.ac.ku.KuPremiumAPI.model.FDA418;
import th.ac.ku.KuPremiumAPI.repository.FDA416Repository;
import th.ac.ku.KuPremiumAPI.repository.FDA418Repository;

import java.util.List;
import java.util.UUID;

@Service
public class FDA418Service {

    @Autowired
    private FDA418Repository repository;

    public List<FDA418> getAll(){
        return repository.findAll();
    }

    public FDA418 create(FDA418 fda418){
        repository.save(fda418);
        return fda418;
    }

    public FDA418 getFDA418(UUID id){
        return repository.findById(id).get();
    }

    public FDA418 update(UUID id, FDA418 requestBody){
        FDA418 record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setR_name(requestBody.getR_name());
        record.setBenzoic_sorbic_f(requestBody.getBenzoic_sorbic_f());
        record.setBenzoic_c(requestBody.getBenzoic_c());
        record.setSorbic_c(requestBody.getSorbic_c());
        record.setBenzoic_sorbic_f(requestBody.getBenzoic_sorbic_f());
        record.setSynt_s(requestBody.getSynt_s());
        record.setSynt_c(requestBody.getSynt_c());
        record.setSynt_f(requestBody.getSynt_f());
        record.setSod_s(requestBody.getSod_s());
        record.setSod_c(requestBody.getSod_c());
        record.setSod_f(requestBody.getSod_f());
        record.setPotas_s(requestBody.getPotas_s());
        record.setPotas_c(requestBody.getPotas_c());
        record.setPotas_f(requestBody.getPotas_f());
        record.setPlate_s(requestBody.getPlate_s());
        record.setPlate_c(requestBody.getPlate_c());
        record.setPlate_f(requestBody.getPlate_f());

        repository.save(record);
        return record;
    }

    public FDA418 delete(UUID id){
        FDA418 record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
