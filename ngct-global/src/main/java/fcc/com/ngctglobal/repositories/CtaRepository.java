package fcc.com.ngctglobal.repositories;


import fcc.com.ngctglobal.domain.CtaContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CtaRepository extends JpaRepository<CtaContract, Long> {
    Optional<CtaContract> findByCtaNumber(String s);
}
