package com.mio.motoservice.repositorio;

import java.util.List;

import com.mio.motoservice.entidades.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer>{

	List<Moto> findByUsuarioId(int usuarioId);
	
}
