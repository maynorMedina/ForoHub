package com.aluracursos.Api_ForoHub.controller;

import com.aluracursos.Api_ForoHub.entities.Topicos;
import com.aluracursos.Api_ForoHub.model.DatosActualizarTopicos;
import com.aluracursos.Api_ForoHub.model.DatosTopicos;
import com.aluracursos.Api_ForoHub.repository.ITopicosRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

    //Llamar el respositorio.
    @Autowired
    private ITopicosRepository topicosRepository;

    //Atrapar el request
    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosTopicos datosTopicos){
        topicosRepository.save(new Topicos(datosTopicos));
    }

    @GetMapping
    public Page<Topicos> listarTopicos(@PageableDefault(size = 10, sort = {"titulo"}, direction = Sort.Direction.ASC) Pageable pageable) {
        return topicosRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topicos> obtenerDetalleTopico(@PathVariable Long id) {
        Optional<Topicos> optionalTopic = topicosRepository.findById(id);
        return optionalTopic.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
//        var topico = topicosRepository.getReferenceById(id);
//        return ResponseEntity.ok(topico);
    }

    @PutMapping("/{id}")
    @Transactional
    public void actulizarTopicos(@PathVariable Long id, @RequestBody @Valid DatosActualizarTopicos datosActualizarTopicos){
        Topicos topicos = topicosRepository.getReferenceById(datosActualizarTopicos.id());
        topicos.actulizarTopicos(datosActualizarTopicos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopicos(@PathVariable Long id) {
        topicosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
