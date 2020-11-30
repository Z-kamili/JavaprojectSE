
public class Personne {
	
	private String name;
	private String prenom;
	private int age;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	public Personne(String name,String prenom,int age){
		this.name = name;
		this.prenom = prenom;
		this.age = age;
		
	}
	
	public void  SetName(String name){
		
		this.name = name;
		
	}
	
	public void SetPrenom(String prenom) {
		
		this.prenom = prenom;
	}
	
	public void SetAge(int age) {
		
		this.age = age;
	}
	
	public String getNom() {
		
		return this.name;
		
	}
	
	public String getPrenom() {
		
		return this.prenom;
		
	}
	public int getAge() {
		
		return this.age;
		
	}

	

}
