package com.desafioDio2_outro.desafio2.repository;

import com.desafioDio2_outro.desafio2.model.JornadadeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadadeTrabalho, Long> {
}
