package com.rbittencourt.hexagonal.architecture.sample.infrastructure.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<ItemEntity, Long> {
}
