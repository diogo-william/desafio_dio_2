package com.desafioDio2_outro.desafio2.model;



import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder


@Entity
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelAcesso niveldeacesso;
    private String descricao;



}


