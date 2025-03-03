package com.forohub.foro_hub.domain.topico;

import com.forohub.foro_hub.domain.respuesta.DatosDetallesRespuesta;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record DatosDetallesTopico(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean estado,
        Long idUsuario,
        Long idCurso,
        List<DatosDetallesRespuesta> respuestas) {

    public DatosDetallesTopico(Topico topico) {
        this(
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getEstado(),
                topico.getUsuario().getId(),
                topico.getCurso().getId(),
                topico.getRespuestas().stream().map(DatosDetallesRespuesta::new).collect(Collectors.toList())
        );
    }
}
