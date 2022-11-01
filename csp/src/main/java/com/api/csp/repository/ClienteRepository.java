package com.api.csp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.csp.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
