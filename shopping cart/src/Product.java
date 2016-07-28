

public class Product {
	
	private String iD;
	private String name;
	private double price;
	
	Product(String iD, String name){
		//mandatory parameters
		this.iD= iD;
		this.name = name;
	}
	
	Product(String iD, String name, double price){
		//mandatory parameters
		this.iD= iD;
		this.name = name;
		this.price = price;
	}
	
	public String getiD() {
		return iD;
	}


	public void setiD(String iD) {
		this.iD = iD;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
