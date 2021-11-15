package com.desafioDio2_outro.desafio2;


import com.desafioDio2_outro.desafio2.model.JornadadeTrabalho;
import com.desafioDio2_outro.desafio2.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {


    public List<JornadadeTrabalho> findAll;
    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }


    public JornadadeTrabalho saveJornada(JornadadeTrabalho jornadadeTrabalho)
    {
      return   jornadaRepository.save(jornadadeTrabalho);

    }


    public List<JornadadeTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadadeTrabalho> getById(Long idJornada) {
    return jornadaRepository.findById(idJornada);
    }

    public JornadadeTrabalho updateJornada(JornadadeTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }





}
