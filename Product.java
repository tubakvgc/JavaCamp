package ornek;

public class Product {
	
	public Product() { 	
	     System.out.println("Yazýlým Geliþtirici Yetiþtirme Kampý");
	
	}

	public Product(int id,String name,String detail,String teacher_name) {
		this();
		this.id =id;
		this.name =name;
		this.teacher_name=teacher_name;
		this.detail = detail;

}

		
	int id; 
	String name;
	double unitPrice; 
	String detail; 
	String teacher_name;
}