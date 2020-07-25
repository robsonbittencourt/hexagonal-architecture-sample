package com.rbittencourt.hexagonal.architecture.sample.anticorruption.order;

import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.order.OrderEntity;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.order.OrderEntityConverter;
import org.springframework.stereotype.Component;

@Component
public class OrderEntityConverterAdapter implements OrderEntityConverter {

    public OrderEntity convertFrom(Order order) {
        return new OrderEntity(order.getClientName(), order.total());
    }

}
