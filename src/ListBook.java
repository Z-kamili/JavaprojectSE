import java.util.ArrayList;
import java.util.List;

public class ListBook {
	
	List<Book> book;
	
	public ListBook() {
		// TODO Auto-generated constructor stub
		book  = new ArrayList<Book>(); 
	}
		public void Add(Book e){
			// TODO Auto-generated method stub
			book.add(e);
			System.out.println("Le livre a ete ajouter");
		}
		public void delete(int ref){
			int i = 0;
			for(i = 0;i<book.size();i++) {
				if(ref == book.get(i).getRef()){
					
					book.remove(i);
					System.out.println("Suppression bien effectuer");
					break;
					
				}
			}
			
		}
		
		
		public void Edit(String name,int ref,double price){
			int i = 0;
			for(i = 0;i<book.size();i++) {
				
				if(ref == book.get(i).getRef() ){
					book.get(i).setName(name);
					book.get(i).setPrice(price);
					book.get(i).setRef(ref);
					
					System.out.println("Modification bien effectuer");
					break;
				}
			}
			
		}
		
		public void Afficher() {
			
			int i = 0;
			for(i = 0;i<book.size();i++) {	
				System.out.println("name : " + book.get(i).getName() + " price : " + book.get(i).getPrice() + " ref" + book.get(i).getRef());
			}
			
	}
	
	

}
