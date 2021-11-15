package com.desafioDio2_outro.desafio2.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne
    private CategoriaUsuario categoria;

    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso acesso;

    @ManyToOne
    private JornadadeTrabalho jornada;

    private BigDecimal tolerancia;
    private LocalDateTime iniciojornada;
    private LocalDateTime fimjornada;







}
