package th.ac.ku.KuPremiumAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.KuPremiumAPI.model.Certificate;

import java.util.UUID;

public interface CertificateRepository extends JpaRepository<Certificate, UUID> {
}
