package ornek;


public class Main2 {
	public static void main(String[] args) {
		Product product1 = new Product(1,"C#+Angular","%50","Engin Demirog");
		Product product2 = new Product(1,"JAVA+ REACT","%100","Engin Demirog");
		Product product3 = new Product(1,"Programlamaya Giriþ Ýçin Temel Kurs","Ücretsiz","Engin Demirog");
	

		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
			
		}
		
		
		 Category category1 = new Category(); 
		    category1.id = 1;
		    category1.name = "Kurslarým";
		    
		    Category category2 = new Category();
		    category2.id = 1;
		    category2.name = "Tüm Kurslar";
		    
		    Category category3 = new Category();
		    category3.id = 1;
		    category3.name = "Kampa Hazýrlýk ";
		    
		    Category category4 = new Category();
		    category4.id = 1;
		    category4.name = "Sýk Sorulan Sorular";
		    
		   
		    
		    Category[] categorys = {category1,category2,category3,category4};
		    for (Category category : categorys) {
		    	System.out.println(category.name);
			
			}
		    
		    
		    Student student1 = new Student();
		    student1.name = "Tuba Kavgacý";
		    Student student2 = new Student();
		    student2.name = "Esra Sancak";
		    
		    Student[] students = {student1,student2};
			
			for (Student student : students) {
				
				System.out.println(student.name);
				
			}
		    
		    
		    StudentManager studentManager = new StudentManager();
		    studentManager.addToCart(student1);
		    studentManager.addToCart(student2);
			
		
	}
	

}
