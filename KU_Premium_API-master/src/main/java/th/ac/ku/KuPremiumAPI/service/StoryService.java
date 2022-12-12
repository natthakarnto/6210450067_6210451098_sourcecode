package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.Research;
import th.ac.ku.KuPremiumAPI.model.Story;
import th.ac.ku.KuPremiumAPI.repository.ResearchRepository;
import th.ac.ku.KuPremiumAPI.repository.StoryRepository;

import java.util.List;
import java.util.UUID;

@Service
public class StoryService {
    @Autowired
    private StoryRepository repository;

    public List<Story> getAll(){
        return repository.findAll();
    }

    public Story create(Story story){
        repository.save(story);
        return story;
    }
    public Story getStory(UUID id){
        return repository.findById(id).get();
    }

    public Story update(UUID id, Story requestBody){
        Story record = repository.findById(id).get();
        record.setProductName(requestBody.getProductName());
        record.setProdStoryName(requestBody.getProdStoryName());

        repository.save(record);
        return record;
    }

    public Story delete(UUID id){
        Story record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }
}
