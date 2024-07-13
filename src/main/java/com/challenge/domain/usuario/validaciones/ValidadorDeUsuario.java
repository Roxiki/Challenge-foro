package com.challenge.domain.usuario.validaciones;

import  com.challenge.domain.topico.RegistroTopicoDTO;
import  com.challenge.domain.usuario.RegistroUsuarioDTO;
import  com.challenge.domain.usuario.RespuestaUsuarioDTO;

public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}