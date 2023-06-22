package com.mio.carroservice.repositorio;

import java.util.List;

import com.mio.carroservice.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

	List<Carro> findByUsuarioId(int usuarioId);
	
}
