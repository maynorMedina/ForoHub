package com.aluracursos.Api_ForoHub.model;

import com.aluracursos.Api_ForoHub.entities.Topicos;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public record DatosListadoTopicos(Long id, String titulo, String mensaje, String fecha_Creacion,Status status, String autor, String curso) {
        public DatosListadoTopicos(Topicos topicos){
                this(topicos.getId(),topicos.getTitulo(),topicos.getMensaje(),topicos.getFecha_creacion(),topicos.getStatus(), topicos.getAutor(),topicos.getCurso());
        }

}
