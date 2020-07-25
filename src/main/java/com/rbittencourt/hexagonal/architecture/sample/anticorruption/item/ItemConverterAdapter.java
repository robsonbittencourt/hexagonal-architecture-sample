package com.rbittencourt.hexagonal.architecture.sample.anticorruption.item;

import com.rbittencourt.hexagonal.architecture.sample.application.item.ItemConverter;
import com.rbittencourt.hexagonal.architecture.sample.domain.item.Item;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.item.ItemEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemConverterAdapter implements ItemConverter {

    public List<Item> convertFrom(List<ItemEntity> itemsEntity) {
        return itemsEntity.stream()
                .map(i -> new Item(i.getDescription(), i.getPrice()))
                .collect(Collectors.toList());
    }

}
