package fcc.com.ngctglobal.demo;

import fcc.com.ngctglobal.domain.BenBeneficiary;
import fcc.com.ngctglobal.domain.CtaBenLink;
import fcc.com.ngctglobal.domain.CtaContract;
import fcc.com.ngctglobal.repositories.BenRepository;
import fcc.com.ngctglobal.repositories.CtaBenRepository;
import fcc.com.ngctglobal.repositories.CtaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CtaRepository ctaRepo;

    @Autowired
    BenRepository benRepo;

    @Autowired
    CtaBenRepository ctabenRepo;

    @Override
    public void run(String... args) throws Exception {


        CtaContract nCta = new CtaContract();
        nCta.setCtaNumber("5465465464646");
        ctaRepo.save(nCta);

        nCta = new CtaContract();
        nCta.setCtaNumber("5465465464647");
        ctaRepo.save(nCta);

        BenBeneficiary nBen = new BenBeneficiary();
        nBen.setBenNumber("75645");
        benRepo.save(nBen);


        Optional<CtaContract> cta = ctaRepo.findByCtaNumber("5465465464646");
        if (cta.isPresent()){


        nBen = new BenBeneficiary();
        nBen.setBenNumber("75647");
        benRepo.save(nBen);

            CtaBenLink ctaben = new CtaBenLink();
            ctaben.setCtaContract(cta.get());
            ctaben.setBenBeneficiary(nBen);
            ctabenRepo.save(ctaben);
        }

    }
}
