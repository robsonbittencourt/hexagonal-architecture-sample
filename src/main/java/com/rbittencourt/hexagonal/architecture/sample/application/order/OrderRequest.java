package com.rbittencourt.hexagonal.architecture.sample.application.order;

import java.util.List;

public class OrderRequest {

    private Long clientId;
    private List<Long> itemsIds;

    public Long getClientId() {
        return clientId;
    }

    public List<Long> getItemsIds() {
        return itemsIds;
    }

}
