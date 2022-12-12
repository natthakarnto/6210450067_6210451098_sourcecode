package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.FDA414;
import java.util.UUID;

@Repository
public interface FDA414Repository extends JpaRepository<FDA414, UUID> {
}
