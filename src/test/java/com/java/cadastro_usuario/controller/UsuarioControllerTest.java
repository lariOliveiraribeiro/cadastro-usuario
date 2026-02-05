package com.java.cadastro_usuario.controller;

import com.java.cadastro_usuario.business.UsuarioService;
import com.java.cadastro_usuario.infrastructere.entitys.Usuario;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UsuarioService usuarioService;

    @Test
    void deveBuscarUsuarioPorEmail() throws Exception{
        Usuario usuario = new Usuario();
        usuario.setNome("Larissa");
        usuario.setEmail("teste@email.com");

        when(usuarioService.buscarUsuarioPorEmail("teste@email.com"))
                .thenReturn(usuario);

        mockMvc.perform(get("/usuario")
                        .param("email", "teste@email.com"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email").value("teste@email.com"))
                .andExpect(jsonPath("$.nome").value("Larissa"));
    }

    @Test
    void deveRetornar404QuandoUsuarioNaoExistir() throws Exception{
        when(usuarioService.buscarUsuarioPorEmail("naoexiste@email.com"))
                .thenReturn(null);
        mockMvc.perform(get("/usuario")
                        .param("email", "naoexiste@email.com"))
                .andExpect(status().isNotFound());

    }

    @Test
    void deveCriarUsuario()throws Exception {
        String json = """
        {
          "nome": "Larissa",
          "email": "larissa@email.com"
        }
        """;

        Usuario usuarioSalvo = new Usuario();
        usuarioSalvo.setNome("Larissa");
        usuarioSalvo.setEmail("larissa@email.com");

        doNothing().when(usuarioService).salvarUsuario(any(Usuario.class));

        mockMvc.perform(post("/usuario")
                        .contentType("application/json")
                        .content(json))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nome").value("Larissa"))
                .andExpect(jsonPath("$.email").value("larissa@email.com"));
    }
}
