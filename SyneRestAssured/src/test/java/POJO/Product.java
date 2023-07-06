package POJO;

import org.apache.juneau.annotation.Beanc;

public class Product
{
	//pojo
	private String name;
	private String price;
	private String color;
	private String[] sellerNames;
	
	@Beanc(properties="name,price,color,sellerNames")
	public Product(String name, String price, String color, String[] sellerNames) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerNames = sellerNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getSellerNames() {
		return sellerNames;
	}

	public void setSellerNames(String[] sellerNames) {
		this.sellerNames = sellerNames;
	}
	
	
	
	
}
