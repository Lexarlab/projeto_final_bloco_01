package ecommerce.model;

public class ProdutoFruta extends Produto{

	private String category;

	public ProdutoFruta(String name, int id, float price, String category) {
		super(name, id, price);
		this.setCategory(category);
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public void view () {
		super.view();
	}

}
