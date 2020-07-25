package com.rbittencourt.hexagonal.architecture.sample.infrastructure.order;

import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;

public interface OrderEntityConverter {

    OrderEntity convertFrom(Order order);

}
