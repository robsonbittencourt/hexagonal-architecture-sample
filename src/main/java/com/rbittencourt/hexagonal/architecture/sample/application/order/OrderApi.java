package com.rbittencourt.hexagonal.architecture.sample.application.order;

import com.rbittencourt.hexagonal.architecture.sample.application.client.ClientConverter;
import com.rbittencourt.hexagonal.architecture.sample.application.item.ItemConverter;
import com.rbittencourt.hexagonal.architecture.sample.domain.client.Client;
import com.rbittencourt.hexagonal.architecture.sample.domain.item.Item;
import com.rbittencourt.hexagonal.architecture.sample.domain.order.Order;
import com.rbittencourt.hexagonal.architecture.sample.domain.order.OrderDispatcherPort;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.client.ClientDao;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.client.ClientEntity;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.item.ItemDao;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.item.ItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderApi {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private ClientConverter clientConverter;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ItemConverter itemConverter;

    @Autowired
    private OrderDispatcherPort orderDispatcher;

    @PostMapping
    public void createOrder(@RequestBody OrderRequest request) {
        ClientEntity clientEntity = clientDao.findById(request.getClientId()).orElseThrow(() -> new RuntimeException("Client not found"));
        Client client = clientConverter.convertFrom(clientEntity);

        List<ItemEntity> itemsEntity = itemDao.findAllById(request.getItemsIds());
        List<Item> items = itemConverter.convertFrom(itemsEntity);

        Order order = new Order(client, items);

        orderDispatcher.dispatch(order);
    }

}
