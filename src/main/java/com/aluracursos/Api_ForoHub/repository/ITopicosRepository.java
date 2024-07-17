package com.aluracursos.Api_ForoHub.repository;

import com.aluracursos.Api_ForoHub.entities.Topicos;
import com.aluracursos.Api_ForoHub.model.DatosActualizarTopicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITopicosRepository extends JpaRepository<Topicos, Long> {

}
