package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Certificate;
import th.ac.ku.KuPremiumAPI.model.FDA365;
import th.ac.ku.KuPremiumAPI.repository.CertificateRepository;
import th.ac.ku.KuPremiumAPI.repository.FDA365Repository;

import java.util.List;
import java.util.UUID;

@Service
public class FDA365Service {
    @Autowired
    private FDA365Repository repository;

    public List<FDA365> getAll(){
        return repository.findAll();
    }

    public FDA365 create(FDA365 fda365){
        repository.save(fda365);
        return fda365;
    }

    public FDA365 getFDA365(UUID id){
        return repository.findById(id).get();
    }

    public FDA365 update(UUID id, FDA365 requestBody){
        FDA365 record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setR_name(requestBody.getR_name());
        record.setPh_value_s(requestBody.getPh_value_s());
        record.setPh_value_c(requestBody.getPh_value_c());
        record.setPh_value_f(requestBody.getPh_value_f());
        record.setColi_s(requestBody.getColi_s());
        record.setColi_c(requestBody.getColi_c());
        record.setColi_f(requestBody.getColi_f());
        record.setYeast_mold_s(requestBody.getYeast_mold_s());
        record.setYeast_mold_r(requestBody.getYeast_mold_r());
        record.setYeast_c(requestBody.getYeast_c());
        record.setMold_c(requestBody.getMold_c());
        record.setYeast_mold_f(requestBody.getYeast_mold_f());

        repository.save(record);
        return record;
    }

    public FDA365 delete(UUID id){
        FDA365 record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
