package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {
	
	public void lookForId(int id);
	public void listAll();
	public void register(Produto produto);
	public void update(Produto produto);
	public void delete(int id);

}
