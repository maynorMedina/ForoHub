package com.aluracursos.Api_ForoHub.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha_creacion,
        @NotNull
        Status status,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {
}
