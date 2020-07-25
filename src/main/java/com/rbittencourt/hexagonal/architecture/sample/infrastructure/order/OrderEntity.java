package com.rbittencourt.hexagonal.architecture.sample.infrastructure.order;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String clientName;

    @Column
    private BigDecimal totalValue;

    public OrderEntity(String clientName, BigDecimal totalValue) {
        this.clientName = clientName;
        this.totalValue = totalValue;
    }

    public String getClientName() {
        return clientName;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

}
