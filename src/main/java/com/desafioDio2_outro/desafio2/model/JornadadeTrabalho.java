package com.desafioDio2_outro.desafio2.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

@Entity

public class JornadadeTrabalho {
    @Id
    private long id;
    private String descricao;


}


