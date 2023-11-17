package com.squad42.InglesTransforma.repository;

import com.squad42.InglesTransforma.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
