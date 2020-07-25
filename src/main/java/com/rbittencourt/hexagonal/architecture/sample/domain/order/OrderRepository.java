package com.rbittencourt.hexagonal.architecture.sample.domain.order;

public interface OrderRepository {

    void store(Order order);

}
