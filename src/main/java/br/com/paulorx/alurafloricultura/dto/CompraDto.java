package br.com.paulorx.alurafloricultura.dto;

import java.util.List;

import br.com.paulorx.alurafloricultura.model.Endereco;
import br.com.paulorx.alurafloricultura.model.ItemPedido;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDto {

	private List<ItemPedido> itens;
	
	private Endereco endereco;
	
}
