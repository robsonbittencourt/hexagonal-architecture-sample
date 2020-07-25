package com.rbittencourt.hexagonal.architecture.sample.domain.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDispatcher implements OrderDispatcherPort {

    @Autowired
    private EmailSender emailSender;

    @Autowired
    private SmsSender smsSender;

    @Autowired
    private OrderRepository orderRepository;

    public void dispatch(Order order) {
        orderRepository.store(order);

        if (order.hasEmail()) {
            emailSender.sendEmail(order);
        }

        smsSender.sendSms(order);
    }

}
