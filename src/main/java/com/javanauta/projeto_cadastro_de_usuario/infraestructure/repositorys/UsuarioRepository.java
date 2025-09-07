package com.javanauta.projeto_cadastro_de_usuario.infraestructure.repositorys;


import com.javanauta.projeto_cadastro_de_usuario.infraestructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    Optional <Usuario> findByEmail(String email);


    void deleteByEmail(String email);
}
