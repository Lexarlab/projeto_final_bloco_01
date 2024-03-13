package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList <Produto> listProduct= new ArrayList <Produto>();
	int id = 0;
	
	@Override
	public void lookForId(int id) {
		
	}

	@Override
	public void listAll() {
		for (var product: listProduct) {
			product.view();
		}
		
	}

	@Override
	public void register(Produto produto) {
		listProduct.add(produto);
		System.out.println("\nO Produto " + produto.getId() + " foi registrado com sucesso!");
	}

	@Override
	public void update(Produto produto) {
		var searchProduct = searchInCollection(produto.getId());
		
		if(searchProduct != null) {
			listProduct.set(listProduct.indexOf(searchProduct), produto);
			System.out.println("\nProduto " + produto.getName() + " foi atualizada com sucesso!");
		} else 
			System.out.println("\nProduto " + produto.getName() + " não foi encontrado!");
		
	}

	@Override
	public void delete(int id) {
		var produto = searchInCollection(id);
		
		if(produto != null) {
			if(listProduct.remove(produto) == true)
				System.out.println("\nO produto " + id + " foi deletado");
		} else 
			System.out.println("\nO produto: " + id + "não foi encontrado");
		
	}
	
	public int generateId() {
		return ++ id;
	}
	public Produto searchInCollection(int id) {
		for (var searchproduct: listProduct) {
			if (searchproduct.getId() == id) {
				return searchproduct;
			}
		}
		return null;
	}

}
