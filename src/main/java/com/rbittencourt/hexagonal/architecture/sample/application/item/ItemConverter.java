package com.rbittencourt.hexagonal.architecture.sample.application.item;

import com.rbittencourt.hexagonal.architecture.sample.domain.item.Item;
import com.rbittencourt.hexagonal.architecture.sample.infrastructure.item.ItemEntity;

import java.util.List;

public interface ItemConverter {

    List<Item> convertFrom(List<ItemEntity> itemsEntity);
    
}
