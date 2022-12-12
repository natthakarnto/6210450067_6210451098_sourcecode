package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Audio;
import th.ac.ku.KuPremiumAPI.repository.AudioRepository;

import java.util.List;
import java.util.UUID;

@Service
public class AudioService {
    @Autowired
    private AudioRepository repository;

    public List<Audio> getAll(){
        return repository.findAll();
    }

    public Audio create(Audio audio){
        repository.save(audio);
        return audio;
    }
    public Audio getAudio(UUID id){
        return repository.findById(id).get();
    }

    public Audio update(UUID id, Audio requestBody){
        Audio record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProdAudioName(requestBody.getProdAudioName());

        repository.save(record);
        return record;
    }

    public Audio delete(UUID id){
        Audio record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
