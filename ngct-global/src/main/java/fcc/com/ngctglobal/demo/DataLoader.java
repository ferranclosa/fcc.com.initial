package fcc.com.ngctglobal.demo;

import fcc.com.ngctglobal.domain.CtaContract;
import fcc.com.ngctglobal.repositories.CtaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CtaRepository ctaRepo;

    @Override
    public void run(String... args) throws Exception {


        CtaContract nCta = new CtaContract();
        nCta.setCtaNumber("5465465464646");
        ctaRepo.save(nCta);

        nCta = new CtaContract();
        nCta.setCtaNumber("87984556646");
        ctaRepo.save(nCta);



    }
}
