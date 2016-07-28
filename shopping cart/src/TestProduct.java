
import java.util.ArrayList;

public class TestProduct {

	public static void main(String[] args) {

//		
		Product p1 = new Product("PRD001", "Laptop");
		Product p2 = new Product("PDR002", "iPhone", 50000);
		
		p1.setPrice(30000);
		
		System.out.println(p1.getiD() + "\n" + p1.getName() + "\n" + p1.getPrice());
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		Product p = new Product ("PDR1", "Dell Laptop", 50000);
		products.add(p);
		
		p = new Product ("PDR2", "iPhone", 50000);
		products.add(p);
		
		p = new Product ("PDR3", "LG G4", 50000);
		products.add(p);
		//for (dataType variable:arrayList) {}
		for (Product prd:products){
			System.out.println(prd.getiD());
			System.out.println(prd.getName());
			System.out.println(prd.getPrice());
		}
	}	

}
		
	
	





