package th.ac.ku.KuPremiumAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import th.ac.ku.KuPremiumAPI.model.User;
import th.ac.ku.KuPremiumAPI.repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }

    public User create(User user){

        passwordEncoder = new BCryptPasswordEncoder();
        String enc = passwordEncoder.encode(user.getPassword());
        user.setPassword(enc);
        repository.save(user);
        return user;
    }

    public User getUser(UUID id){
        return repository.findById(id).get();
    }

    public User update(UUID id, User requestBody){

        User record = repository.findById(id).get();
        record.setUsername(requestBody.getUsername());
        record.setPassword(requestBody.getPassword());
        record.setFirstName(requestBody.getFirstName());
        record.setLastName(requestBody.getLastName());
        record.setTelNo(requestBody.getTelNo());
        record.setEmail(requestBody.getEmail());
        record.setCompanyName(requestBody.getCompanyName());
        record.setCompanyAddress(requestBody.getCompanyAddress());

        repository.save(record);
        return record;
    }

    public User delete (UUID id){

        User record = repository.findById(id).get();
        repository.deleteById(id);
        return record;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
