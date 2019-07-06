package fcc.com.ngctglobal.exchange;

import java.io.Serializable;

public class CtaoDTO implements Serializable {

    private Long contractId ;
    private String ContractNumber;

    public CtaoDTO() {
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return ContractNumber;
    }

    public void setContractNumber(String contractNumber) {
        ContractNumber = contractNumber;
    }
}
