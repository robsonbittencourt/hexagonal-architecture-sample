package com.rbittencourt.hexagonal.architecture.sample.domain.order;

public interface OrderDispatcherPort {

    void dispatch(Order order);

}
