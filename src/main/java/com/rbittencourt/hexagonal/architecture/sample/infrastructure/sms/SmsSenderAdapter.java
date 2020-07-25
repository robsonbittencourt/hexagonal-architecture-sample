package com.rbittencourt.hexagonal.architecture.sample.infrastructure.sms;

import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;
import com.rbittencourt.hexagonal.architecture.sample.domain.order.SmsSender;
import org.springframework.stereotype.Service;

@Service
public class SmsSenderAdapter implements SmsSender {

    @Override
    public void sendSms(Order order) {
        System.out.println("Sending sms to: " + order.getClientPhone());
    }

}
