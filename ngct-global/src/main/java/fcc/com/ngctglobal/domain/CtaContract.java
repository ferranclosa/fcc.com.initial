package fcc.com.ngctglobal.domain;

import javax.persistence.*;

@Entity
@Table(name = "cta_contract",
    indexes = {@Index(name = "idx_byCtaNum", columnList = "cta_num" )},
    schema = "contract")
public class CtaContract {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CTA_ID")
    @TableGenerator(name = "CTA_ID",
            table = "id_gen",
            schema = "contract",
            pkColumnName = "keyName",
            pkColumnValue = "cta_id",
            valueColumnName = "keyValue",
            initialValue = 0,
            allocationSize = 10)
    @Column(name="id")
    private Long id;
    @Column(length = 20, nullable = false, name = "cta_num")
    private String ctaNumber;

    @Version
    private Integer version;

    public CtaContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCtaNumber() {
        return ctaNumber;
    }

    public void setCtaNumber(String ctaNumber) {
        this.ctaNumber = ctaNumber;
    }
}
