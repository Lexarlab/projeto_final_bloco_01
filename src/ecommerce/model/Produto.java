package ecommerce.model;

public abstract class Produto {
	
	private String name;
	private int id;
	private int type;
	private float price;
	
	public Produto(String name, int id, float price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void view () {
		System.out.println("Numero de id: " + this.id);
		System.out.println("Nome do Produto: " + this.name);
		System.out.println("Tipo do Produto: " + this.type);
		System.out.println("Preço: " + this.price);
	}
	
}
