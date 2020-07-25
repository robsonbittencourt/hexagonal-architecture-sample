package com.rbittencourt.hexagonal.architecture.sample.infrastructure.email;

import com.rbittencourt.hexagonal.architecture.sample.domain.order.EmailSender;
import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderAdapter implements EmailSender {

    @Override
    public void sendEmail(Order order) {
        System.out.println("Sending email to: " + order.getClientEmail());
    }

}
