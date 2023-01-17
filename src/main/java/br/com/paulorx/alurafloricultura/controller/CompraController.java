package br.com.paulorx.alurafloricultura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulorx.alurafloricultura.dto.CompraDto;
import br.com.paulorx.alurafloricultura.service.CompraService;

@RestController
@RequestMapping("/floricultura")
public class CompraController {
	
	@Autowired
	private CompraService compraService;
	
	@PostMapping("/compra")
	public void realizarCompra(@RequestBody CompraDto compra) {
		compraService.realizarCompra(compra);
	}

}
