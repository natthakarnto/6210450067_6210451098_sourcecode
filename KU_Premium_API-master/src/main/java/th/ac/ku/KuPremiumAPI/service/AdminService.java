package th.ac.ku.KuPremiumAPI.service;//package th.ac.ku.cakeAPI.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import th.ac.ku.cakeAPI.repository.AdminRepository;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//public class AdminService {
//
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    private AdminRepository repository;
//
//    public List<Admin> getAll(){return repository.findAll();}
//
//    public Admin create(Admin admin){
//
//        passwordEncoder = new BCryptPasswordEncoder();
//        String enc = passwordEncoder.encode(admin.getPassword());
//        admin.setPassword(enc);
//        repository.save(admin);
//        return admin;
//    }
//
//    public Admin getAdmin(UUID id){
//        return repository.findById(id).get();
//    }
//
//    public Admin update(UUID id, Admin requestBody){
//
//        Admin record = repository.findById(id).get();
//        record.setUsername(requestBody.getUsername());
//        record.setPassword(requestBody.getPassword());
//        record.setFirstName(requestBody.getFirstName());
//        record.setLastName(requestBody.getLastName());
//        record.setTelNo(requestBody.getTelNo());
//        record.setEmail(requestBody.getEmail());
//        record.setResearcherRank(requestBody.getResearcherRank());
//
//        repository.save(record);
//        return record;
//    }
//
//    public Admin delete (UUID id){
//
//        Admin record = repository.findById(id).get();
//        repository.deleteById(id);
//        return record;
//    }
//
////    @Bean
////    public PasswordEncoder passwordAdminEncoder(){
////        return new BCryptPasswordEncoder();
////    }
//}
