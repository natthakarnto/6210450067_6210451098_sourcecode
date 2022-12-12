package th.ac.ku.KuPremiumAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.Cakes;

import java.util.UUID;

@Repository
public interface CakesRepository extends JpaRepository<Cakes, UUID> {
}
