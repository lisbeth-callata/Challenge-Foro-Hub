package com.forohub.foro_hub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record AutenticarUsuario(
        @NotBlank String correo,
        @NotBlank String contrasena) {
}
