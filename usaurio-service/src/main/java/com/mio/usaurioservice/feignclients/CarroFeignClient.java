package com.mio.usaurioservice.feignclients;

import java.util.List;

import com.mio.usaurioservice.modelos.Carro;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "carro-service",url = "http://localhost:8002")
@RequestMapping("/carro")
public interface CarroFeignClient {

	@PostMapping()
	public Carro save(@RequestBody Carro carro);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Carro> getCarros(@PathVariable("usuarioId") int usuarioId);
}
