package com.rbittencourt.hexagonal.architecture.sample.domain.order;

public interface EmailSender {

    void sendEmail(Order order);

}
