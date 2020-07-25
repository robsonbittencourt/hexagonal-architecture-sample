package com.rbittencourt.hexagonal.architecture.sample.domain.order;

import com.rbittencourt.hexagonal.architecture.sample.domain.client.Client;
import com.rbittencourt.hexagonal.architecture.sample.domain.item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.ZERO;
import static org.springframework.util.StringUtils.isEmpty;

public class Order {

    private Client client;
    private List<Item> items;

    public Order(Client client, List<Item> items) {
        validateCreateArguments(client);

        this.client = client;
        this.items = items != null ? items : new ArrayList<>();
    }

    public String getClientName() {
        return client.getName();
    }

    public String getClientPhone() {
        return client.getPhone();
    }

    public String getClientEmail() {
        return client.getEmail();
    }

    public boolean hasEmail() {
        return !isEmpty(client.getEmail());
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Invalid Item");
        }

        items.add(item);
    }

    public BigDecimal total() {
        return items.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal::add)
                .orElse(ZERO);
    }

    private void validateCreateArguments(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("Client is mandatory to create an Order");
        }
    }

}

