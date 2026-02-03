package com.java.cadastro_usuario.service;

import com.java.cadastro_usuario.business.UsuarioService;
import com.java.cadastro_usuario.infrastructere.entitys.Usuario;
import com.java.cadastro_usuario.infrastructere.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {
    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    void deveSalvarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Larissa");

        usuarioService.salvarUsuario(usuario);

        verify(usuarioRepository).saveAndFlush(usuario);
    }

    @Test
    void deveLancarExcecaoQuandoUsuarioNaoEncontrado() {
        when(usuarioRepository.findByEmail("teste@email.com"))
                .thenReturn(Optional.empty());
        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> usuarioService.buscarUsuarioPorEmail("teste@email.com")
        );
        assertEquals("Usuário não encontrado", exception.getMessage());
    }

    @Test
    void deveBuscarUsuarioPorEmail() {
        Usuario usuario = new Usuario();
        usuario.setNome("Larissa");
        usuario.setEmail("teste@email.com");

        when(usuarioRepository.findByEmail("teste@email.com"))
                .thenReturn(Optional.of(usuario));

        Usuario resultado = usuarioService.buscarUsuarioPorEmail("teste@email.com");
        assertNotNull(resultado);
        assertEquals("Larissa", resultado.getNome());
        assertEquals("teste@email.com", resultado.getEmail());
    }




}
