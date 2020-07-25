package com.rbittencourt.hexagonal.architecture.sample.application.client;

import com.rbittencourt.hexagonal.architecture.sample.domain.client.Client;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.client.ClientEntity;

public interface ClientConverter {

    Client convertFrom(ClientEntity clientEntity);

}
