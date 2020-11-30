import java.util.ArrayList;
import java.util.List;

public class ListEtudiant {
List<Etudiant> etudiant;
	
public ListEtudiant() {
	// TODO Auto-generated constructor stub
	etudiant  = new ArrayList<Etudiant>(); 
}
	public void Add(Etudiant e) {
		// TODO Auto-generated method stub
		etudiant.add(e);
		System.out.println("L'Etudiant a ete ajouter");
	}
	public void delete(String cne){
		
		int i = 0;
		for(i = 0;i<etudiant.size();i++) {
			System.out.println(etudiant.get(i).getCne());
			if(cne.equals(etudiant.get(i).getCne())){
				
				etudiant.remove(i);
				System.out.println("Suppression bien effectuer");
				break;
				
			}
		}
		
	}
	
	
	public void Edit(String name,String prenom,int age,String cne,String Filiaire){
		int i = 0;
		for(i = 0;i<etudiant.size();i++) {
			
			if(cne.equals(etudiant.get(i).getCne())){
				etudiant.get(i).SetName(name);
				etudiant.get(i).SetPrenom(prenom);
				etudiant.get(i).SetAge(age);
				etudiant.get(i).SetCne(cne);
				etudiant.get(i).SetFiliaire(Filiaire);
				
				System.out.println("Modification bien effectuer");
				break;
			}
		}
		
	}
	
	public void Afficher() {
		
		int i = 0;
		for(i = 0;i<etudiant.size();i++) {	
			System.out.println("name : " + etudiant.get(i).getNom() + " prenom : " + etudiant.get(i).getPrenom() + " Age : " + etudiant.get(i).getAge() + " CNE : " + etudiant.get(i).getCne() + " Filiaire : " + etudiant.get(i).getFiliaire() );
		}
		
}
}
