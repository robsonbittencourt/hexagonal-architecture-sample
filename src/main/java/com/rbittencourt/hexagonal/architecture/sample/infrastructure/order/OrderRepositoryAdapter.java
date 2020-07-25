package com.rbittencourt.hexagonal.architecture.sample.infrastructure.order;

import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;
import com.rbittencourt.hexagonal.architecture.sample.domain.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryAdapter implements OrderRepository {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderEntityConverter orderEntityConverter;

    @Override
    public void store(Order order) {
        OrderEntity orderEntity = orderEntityConverter.convertFrom(order);

        orderDao.save(orderEntity);
    }

}
