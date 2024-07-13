package com.challenge.domain.respuesta;

import com.challenge.domain.topico.Topico;
import com.challenge.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record RespuestaDTO(
        @NotBlank
        String solution,
        @NotNull
        @Valid
        Long usuario_Id,
        @NotNull
        @Valid
        Long topico_Id,
        LocalDateTime creationDate) {
}