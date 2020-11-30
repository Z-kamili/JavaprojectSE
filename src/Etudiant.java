
public class Etudiant extends Personne {
	
	private String cne;
	private String Filiaire;
	
	public Etudiant(String name,String prenom,int age,String cne,String Filiaire){
		super(name,prenom,age);
		SetCne(cne);
		SetFiliaire(Filiaire);
	}
	public void SetCne(String cne) {
		
	this.cne = cne;
		
	}
	
	public String getCne() {
		
		return this.cne;
		
	}
	
	
	public void SetFiliaire(String Filiaire) {
		
		this.Filiaire = Filiaire;
			
		}
		
		public String getFiliaire(){
			
			return this.Filiaire;
			
		}
	
	
	
	
	
	
	

}
