package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Audit;
import th.ac.ku.KuPremiumAPI.model.Inspection;
import th.ac.ku.KuPremiumAPI.repository.AuditRepository;
import th.ac.ku.KuPremiumAPI.repository.InspectionRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AuditService {

    @Autowired
    private AuditRepository repository;

    public List<Audit> getAll(){
        return repository.findAll();
    }

    public Audit create(Audit audit){
        repository.save(audit);
        return audit;
    }

    public Audit getAudit(UUID id){
        return repository.findById(id).get();
    }

    public Audit update(UUID id, Audit requestBody){
        Audit record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProductName(requestBody.getProductName());
        record.setFda_356_Att(requestBody.getFda_356_Att());
        record.setFda_356_Res(requestBody.getFda_356_Res());
        record.setFda_356_Cer(requestBody.getFda_356_Cer());
        record.setFda_414_Att(requestBody.getFda_414_Att());
        record.setFda_414_Res(requestBody.getFda_414_Res());
        record.setFda_414_Cer(requestBody.getFda_414_Cer());
        record.setFda_416_Att(requestBody.getFda_416_Att());
        record.setFda_416_Res(requestBody.getFda_416_Res());
        record.setFda_416_Cer(requestBody.getFda_416_Cer());
        record.setFda_418_Att(requestBody.getFda_418_Att());
        record.setFda_418_Res(requestBody.getFda_418_Res());
        record.setFda_418_Cer(requestBody.getFda_418_Cer());

        repository.save(record);
        return record;
    }

    public Audit delete(UUID id){
        Audit record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
