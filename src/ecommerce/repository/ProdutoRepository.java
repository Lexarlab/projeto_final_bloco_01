package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {
	
	public void procurarPorid(int id);
	public void listarTodas();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);

}
