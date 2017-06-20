package br.mp.mpf.loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}
	
	public void adiciona(Produto produto) {
		produtos.add(produto);
	}

}
