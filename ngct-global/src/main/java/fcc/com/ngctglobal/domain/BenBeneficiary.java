package fcc.com.ngctglobal.domain;

import javax.persistence.*;

@Entity
@Table(name = "ben_beneficiary", indexes = {@Index(name = "idx_byBenNum", columnList = "ben_num" )}, schema = "ngct_contract")
public class BenBeneficiary {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "BEN_ID")
    @TableGenerator(name = "BEN_ID",
            table = "id_gen",
            schema = "ngct_contract",
            pkColumnName = "keyName",
            pkColumnValue = "ben_id",
            valueColumnName = "keyValue",
            initialValue = 0,
            allocationSize = 10)
    @Column(name="id")
    private Long id;
    @Column(length = 30, nullable = false, name = "ben_num")
    private String benNumber;

    public BenBeneficiary() {
    }

}
