package com.forohub.foro_hub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(
        @NotNull Long id,
        @NotBlank String mensaje) {
}
