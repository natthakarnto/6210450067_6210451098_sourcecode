package th.ac.ku.KuPremiumAPI.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.KuPremiumAPI.model.CakesOrder;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<CakesOrder, UUID> {
}
