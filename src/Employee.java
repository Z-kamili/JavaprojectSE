import java.util.ArrayList;
import java.util.List;

public class Employee extends Personne{
	 private double salaire;
	 private  int ref;
	 public Employee() {
		// TODO Auto-generated constructor stub
	}
	 public Employee(String nom,String prenom,int age,double salaire,int ref){
		// TODO Auto-generated constructor stub
		 super(nom,prenom,age);
		 this.salaire = salaire;
		 this.ref = ref;
	}
	 
	 public void SetSalaire(double salaire) {
		 
		 this.salaire = salaire;
		 
	 }
	 public void SetRef(int ref) {
		 
		 this.ref = ref;
	 }
	 
	 public int getRef() {
		 
		 return ref;
	 }
	 
	 public double getSalaire() {
		 return this.salaire;
	 }
	 
	
		
		
	}
