package com.forohub.foro_hub.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String string) {
        super(string);
    }
}
