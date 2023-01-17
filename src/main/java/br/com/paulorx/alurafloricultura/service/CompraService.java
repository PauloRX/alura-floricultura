package br.com.paulorx.alurafloricultura.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.paulorx.alurafloricultura.dto.CompraDto;
import br.com.paulorx.alurafloricultura.model.InfoFornecedor;

@Service
public class CompraService {

	@Value("${floricultura.fornecedor.entrypoint}")
	private String entrypoint;

	public void realizarCompra(CompraDto compra) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<InfoFornecedor> exchange = restTemplate.exchange(entrypoint + compra.getEndereco().getEstado(), HttpMethod.GET, null, InfoFornecedor.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}

}
