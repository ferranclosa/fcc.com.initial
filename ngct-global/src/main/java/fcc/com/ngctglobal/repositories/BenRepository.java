package fcc.com.ngctglobal.repositories;

import fcc.com.ngctglobal.domain.BenBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenRepository extends JpaRepository<BenBeneficiary, Long> {
}
