package com.aluracursos.Api_ForoHub.model;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopicos(@NotNull Long id, String titulo, String mensaje, String fecha_creacion, Status status, String autor, String curso) {
}
