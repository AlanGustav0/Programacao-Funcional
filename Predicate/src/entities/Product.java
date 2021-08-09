package entities;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonstaticProductPredicate() {
		return price >= 100.0;
	}
	
	
	
	@Override
	public String toString() {
		return "Product Name: " + name + ", Price: " + price;
	}
	
	
	

}
