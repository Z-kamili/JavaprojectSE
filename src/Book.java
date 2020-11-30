
public class Book {
	private String name;
	private double price;
	private int ref;
	
	public Book( String name , double price,int ref){
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.ref = ref;
	}
	
	
	public void setPrice(double price) {
		
		this.price = price;
	
	}
	public void setName(String name) {
		
		this.name = name;
	
	}
	
	public   double getPrice(){
		
		
		return this.price;
		
	}
	
	public   String getName(){
		
		
		return this.name;
		
	}
	
	public  int  getRef(){
		
		
		return this.ref;
		
	}
	
	public   void setRef(int ref){
		
		
 this.ref = ref ;
		
	}

}
