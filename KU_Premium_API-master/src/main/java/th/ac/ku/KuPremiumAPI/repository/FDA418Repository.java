package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.FDA416;
import th.ac.ku.KuPremiumAPI.model.FDA418;

import java.util.UUID;

@Repository
public interface FDA418Repository extends JpaRepository<FDA418, UUID> {
}
