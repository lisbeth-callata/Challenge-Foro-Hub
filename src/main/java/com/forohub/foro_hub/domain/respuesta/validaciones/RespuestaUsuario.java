package com.forohub.foro_hub.domain.respuesta.validaciones;


import com.forohub.foro_hub.domain.respuesta.DatosRespuesta;
import com.forohub.foro_hub.domain.usuario.UsuarioRepository;
import com.forohub.foro_hub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaUsuario implements IValidadorDeRespuestas {
    @Autowired
    UsuarioRepository usuarioRepository;

    public void validar(DatosRespuesta datosRespuesta) {
        if (!usuarioRepository.findById(datosRespuesta.idUsuario()).isPresent()) {
            throw new ValidacionDeIntegridad("Usuario no encotrado");
        }
    }
}