package fcc.com.ngctglobal.repositories;

import fcc.com.ngctglobal.domain.BenBeneficiary;
import fcc.com.ngctglobal.domain.CtaBenLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CtaBenRepository extends JpaRepository<CtaBenLink, Long> {

    @Query("select c from CtaBenLink c where c.benBeneficiary = :ben")
    List<CtaBenLink> supplyCtaBenByBen(@Param("ben") BenBeneficiary ben);
}
