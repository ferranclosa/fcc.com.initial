package fcc.com.ngctglobal.controllers;

import fcc.com.ngctglobal.domain.CtaContract;
import fcc.com.ngctglobal.exchange.CtaoDTO;
import fcc.com.ngctglobal.repositories.CtaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/v0")
public class ContractController {


    @Autowired
    CtaRepository ctaRepo;

    @GetMapping(value = "/getContractDatas", produces = MediaType.APPLICATION_JSON_VALUE)
    private List<CtaoDTO> getContractData(){

        List<CtaoDTO> oDTO = new ArrayList<>();
        List<CtaContract> res = new ArrayList<>();

        res = ctaRepo.findAll();

        for (CtaContract  cta: res){
            CtaoDTO odto = new CtaoDTO();
            odto.setContractId(cta.getId());
            odto.setContractNumber(cta.getCtaNumber());
            oDTO.add(odto);
        }
        return oDTO;

    }
}
