package com.rbittencourt.hexagonal.architecture.sample.domain.item;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;
import static org.springframework.util.StringUtils.isEmpty;

public final class Item {

    private String description;
    private BigDecimal price;

    public Item(String description, BigDecimal price) {
        validateCreateArguments(description, price);

        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void validateCreateArguments(String description, BigDecimal price) {
        if (isEmpty(description)) {
            throw new IllegalArgumentException("Invalid description");
        }

        if (price == null || price.compareTo(ZERO) < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
    }

}
