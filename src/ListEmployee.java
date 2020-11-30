import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
	List<Employee> employee;
	
	public ListEmployee() {
		// TODO Auto-generated constructor stub
		employee  = new ArrayList<Employee>(); 
	}
	public void Add(Employee e) {
		// TODO Auto-generated method stub
		employee.add(e);
		System.out.println("L'employer a ete ajouter");
	}
	public void delete(int ref){
		
		int i = 0;
		for(i = 0;i<employee.size();i++) {
			
			if(ref == employee.get(i).getRef()){
				
				employee.remove(i);
				System.out.println("Suppression bien effectuer");
				break;
				
			}
		}
		
	}
	
	
	public void Edit(String name,String prenom,int age,double Salaire,int ref){
		int i = 0;
		for(i = 0;i<employee.size();i++) {
			
			if(ref == employee.get(i).getRef()) {
				
				employee.get(i).SetName(name);
				employee.get(i).SetPrenom(prenom);
				employee.get(i).SetAge(age);
				employee.get(i).SetAge(age);
				employee.get(i).SetSalaire(Salaire);
				System.out.println("Modification bien effectuer");
				break;
			}
		}
		
	}
	
	public void Afficher() {
		
		int i = 0;
		for(i = 0;i<employee.size();i++) {	
			System.out.println("name : " + employee.get(i).getNom() + " prenom : " + employee.get(i).getPrenom() + " Age : " + employee.get(i).getAge() + " references : " + employee.get(i).getRef() + " Salaire : " + employee.get(i).getSalaire());
		}
		

}
	
}
