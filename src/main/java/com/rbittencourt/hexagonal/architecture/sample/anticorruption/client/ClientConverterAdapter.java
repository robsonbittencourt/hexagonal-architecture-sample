package com.rbittencourt.hexagonal.architecture.sample.anticorruption.client;

import com.rbittencourt.hexagonal.architecture.sample.application.client.ClientConverter;
import com.rbittencourt.hexagonal.architecture.sample.domain.client.Client;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.client.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientConverterAdapter implements ClientConverter {

    public Client convertFrom(ClientEntity clientEntity) {
        return new Client(clientEntity.getName(), clientEntity.getPhone(), clientEntity.getEmail());
    }

}
