package fcc.com.ngctglobal.domain;

import javax.persistence.*;

@Entity
@Table(name = "cta_ben_lnk", indexes = {@Index(name = "idx_ctabenUnique", columnList="fk_cta ,fk_ben", unique = true)}, schema = "ngct_contract")
public class CtaBenLink {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CTABEN_ID")
    @TableGenerator(name = "CTABEN_ID",
            table = "id_gen",
            schema = "ngct_contract",
            pkColumnName = "keyName",
            pkColumnValue = "ctaben_id",
            valueColumnName = "keyValue",
            initialValue = 0,
            allocationSize = 10)
    private Long id ;

    @ManyToOne
    @JoinColumn(name = "fk_cta", foreignKey = @ForeignKey(name="FK_ctaByCtaBenLnk"), nullable = false)
    private CtaContract ctaContract;

    @ManyToOne
    @JoinColumn(name = "fk_ben", foreignKey = @ForeignKey(name="FK_benByCtaBenLnk"), nullable = false)
    private BenBeneficiary benBeneficiary;

    @Version
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CtaContract getCtaContract() {
        return ctaContract;
    }

    public void setCtaContract(CtaContract ctaContract) {
        this.ctaContract = ctaContract;
    }

    public BenBeneficiary getBenBeneficiary() {
        return benBeneficiary;
    }

    public void setBenBeneficiary(BenBeneficiary benBeneficiary) {
        this.benBeneficiary = benBeneficiary;
    }
}
