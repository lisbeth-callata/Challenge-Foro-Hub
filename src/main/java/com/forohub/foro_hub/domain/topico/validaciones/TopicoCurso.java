package com.forohub.foro_hub.domain.topico.validaciones;

import com.forohub.foro_hub.domain.curso.CursoRepository;
import com.forohub.foro_hub.domain.topico.DatosTopico;
import com.forohub.foro_hub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoCurso implements IValidadorDeTopicos {
    @Autowired
    CursoRepository cursoRepository;

    public void validar(DatosTopico datosTopico) {
        if (!cursoRepository.findById(datosTopico.idCurso()).isPresent()) {
            throw new ValidacionDeIntegridad("Curso no encontrado");
        }
    }
}
