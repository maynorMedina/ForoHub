package com.aluracursos.Api_ForoHub.entities;

import com.aluracursos.Api_ForoHub.model.DatosActualizarTopicos;
import com.aluracursos.Api_ForoHub.model.DatosTopicos;
import com.aluracursos.Api_ForoHub.model.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    @Column(name = "fecha_creacion")
    private String fecha_creacion;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String autor;
    private String curso;

    //Crear constructor y mappear los parametros
    public Topicos(DatosTopicos datosTopicos) {
        this.titulo = datosTopicos.titulo();
        this.fecha_creacion = datosTopicos.fecha_creacion();
        this.mensaje = datosTopicos.mensaje();
        this.status = datosTopicos.status();
        this.autor = datosTopicos.autor();
        this.curso = datosTopicos.curso();
    }

    public void actulizarTopicos(DatosActualizarTopicos datosActualizarTopicos) {
        if (datosActualizarTopicos.titulo() != null){
            this.titulo = datosActualizarTopicos.titulo();
        }
        if (datosActualizarTopicos.fecha_creacion() != null){
            this.fecha_creacion = datosActualizarTopicos.fecha_creacion();
        }
        if (datosActualizarTopicos.mensaje() != null){
            this.mensaje = datosActualizarTopicos.mensaje();
        }
        if (datosActualizarTopicos.status() != null){
            this.status = datosActualizarTopicos.status();
        }
        if (datosActualizarTopicos.autor() != null){
            this.autor = datosActualizarTopicos.autor();
        }
        if (datosActualizarTopicos.curso() != null){
            this.curso = datosActualizarTopicos.curso();
        }
    }
}
