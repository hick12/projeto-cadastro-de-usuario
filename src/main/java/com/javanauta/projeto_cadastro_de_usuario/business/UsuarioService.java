package com.javanauta.projeto_cadastro_de_usuario.business;


import com.javanauta.projeto_cadastro_de_usuario.infraestructure.entitys.Usuario;
import com.javanauta.projeto_cadastro_de_usuario.infraestructure.repositorys.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarusuarioPorEmail(String email)
    {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
}

    @Transactional
    public void deletarUsuarioporEmail(String email)
    {
        repository.deleteByEmail(email);

    }

    @Transactional
    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .Id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }


}
