package com.forohub.foro_hub.domain.respuesta.validaciones;


import com.forohub.foro_hub.domain.respuesta.DatosRespuesta;
import com.forohub.foro_hub.domain.topico.TopicoRepository;
import com.forohub.foro_hub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaTopico implements IValidadorDeRespuestas {
    @Autowired
    TopicoRepository topicoRepository;

    public void validar(DatosRespuesta datosRespuesta) {
        if (!topicoRepository.findById(datosRespuesta.idTopico()).isPresent()) {
            throw new ValidacionDeIntegridad("topico no econtrado");
        }
    }
}
