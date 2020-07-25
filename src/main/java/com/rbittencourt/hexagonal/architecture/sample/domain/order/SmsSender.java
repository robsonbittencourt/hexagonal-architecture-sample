package com.rbittencourt.hexagonal.architecture.sample.domain.order;

public interface SmsSender {

    void sendSms(Order order);

}
