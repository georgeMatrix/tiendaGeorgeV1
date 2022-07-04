package com.tiendaV1.tiendaGeorgeV1.repository;

import com.tiendaV1.tiendaGeorgeV1.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
