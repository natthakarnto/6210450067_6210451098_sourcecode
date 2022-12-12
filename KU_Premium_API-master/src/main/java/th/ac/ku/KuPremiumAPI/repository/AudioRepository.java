package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.Audio;
import th.ac.ku.KuPremiumAPI.model.Food;

import java.util.UUID;
@Repository
public interface AudioRepository extends JpaRepository<Audio, UUID> {
}
