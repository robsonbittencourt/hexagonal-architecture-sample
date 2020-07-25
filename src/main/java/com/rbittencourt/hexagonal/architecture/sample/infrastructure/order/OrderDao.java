package com.rbittencourt.hexagonal.architecture.sample.infrastructure.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<OrderEntity, Long> {
}
