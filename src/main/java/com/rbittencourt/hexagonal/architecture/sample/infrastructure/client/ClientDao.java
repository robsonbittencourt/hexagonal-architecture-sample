package com.rbittencourt.hexagonal.architecture.sample.infrastructure.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<ClientEntity, Long> {
}
