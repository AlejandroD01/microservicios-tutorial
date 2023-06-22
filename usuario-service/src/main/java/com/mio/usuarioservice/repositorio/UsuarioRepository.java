package com.mio.usuarioservice.repositorio;

import com.mio.usuarioservice.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
