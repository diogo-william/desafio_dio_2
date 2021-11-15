package com.desafioDio2_outro.desafio2.controller;

import com.desafioDio2_outro.desafio2.JornadaService;
import com.desafioDio2_outro.desafio2.model.JornadadeTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")

public class JornadaTrabalhoController {

   @Autowired
   JornadaService jornadaService;


@PostMapping
public JornadadeTrabalho createJornada(@RequestBody JornadadeTrabalho jornadadeTrabalho)
{
    return jornadaService.saveJornada(jornadadeTrabalho);

}

@GetMapping
public List<JornadadeTrabalho> getJornadaList()
{
    return jornadaService.findAll();

}


    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadadeTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public JornadadeTrabalho updateJornada(@RequestBody JornadadeTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadadeTrabalho>) ResponseEntity.ok();

    }



}