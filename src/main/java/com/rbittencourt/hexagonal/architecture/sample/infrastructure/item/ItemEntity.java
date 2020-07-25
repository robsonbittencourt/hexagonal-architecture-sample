package com.rbittencourt.hexagonal.architecture.sample.infrastructure.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static org.springframework.util.StringUtils.isEmpty;

@Entity
@Table(name = "item")
public final class ItemEntity {

    @Id
    private Long id;

    @Column
    private String description;

    @Column
    private BigDecimal price;

    @Column
    private String sku;

    @Column
    private BigDecimal weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

}
