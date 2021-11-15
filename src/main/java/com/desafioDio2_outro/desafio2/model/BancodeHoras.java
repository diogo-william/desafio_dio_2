package com.desafioDio2_outro.desafio2.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancodeHoras {


    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable

    public class BancodeHorasId implements Serializable {

        private long bancoId;
        private long movimentoId;
        private long usuarioId;



    }

    @EmbeddedId
    private BancodeHorasId bancoId;
    private String categoria;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qntHorasTrabalhada;
    private BigDecimal saldoHorasTrabalhada;




}
