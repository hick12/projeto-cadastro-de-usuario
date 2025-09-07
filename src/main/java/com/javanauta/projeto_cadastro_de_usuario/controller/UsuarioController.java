package com.javanauta.projeto_cadastro_de_usuario.controller;


import com.javanauta.projeto_cadastro_de_usuario.business.UsuarioService;
import com.javanauta.projeto_cadastro_de_usuario.infraestructure.entitys.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor


public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario)
    {

        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email)
    {
        return ResponseEntity.ok(usuarioService.buscarusuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioporEmail(@RequestParam String email)
    {
        usuarioService.deletarUsuarioporEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario)
    {
        usuarioService.atualizarUsuarioPorId(id, usuario);
      return ResponseEntity.ok().build();
    }

}
