import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String name = "";
		 	String prenom;
		 	int age;
		 	double salaire;
		 	int ref;
		    int quiter = 2;
		    int verification;
			int choix;
			String filiaire;
			String cne;
			double price;
            ListEmployee employe = new ListEmployee();
            ListEtudiant etudiant = new ListEtudiant();
            ListBook book = new ListBook();
		    Scanner myInput = new Scanner(System.in);
		
		
		while(quiter == 2) {
			System.out.println("1 - Gestion Employer");
			System.out.println("2 - Gestion Etudiant");
			System.out.println("3 - Gestion Book");
			verification = myInput.nextInt();
			if(verification == 1 ) {
				System.out.println("1 - Ajouter Employer");
				System.out.println("2 - Supprimer Employer");
				System.out.println("3 - Modifier Employer");
				System.out.println("4 - Afficher Employer");
			}else if (verification == 2) {
				System.out.println("1 - Ajouter Etudiant");
				System.out.println("2 - Supprimer Etudiant");
				System.out.println("3 - Modifier Etudiant");
				System.out.println("4 - Afficher Etudiant");
			}else {
				System.out.println("1 - Ajouter book");
				System.out.println("2 - Supprimer book");
				System.out.println("3 - Modifier book");
				System.out.println("4 - Afficher book");
			}
		choix = myInput.nextInt();
		
		if(verification == 1) {
			switch(choix) {
			
			case 1: 
				System.out.println("Enter your references ");
				ref = myInput.nextInt();
				System.out.println("Enter your name ");
				name = myInput.next(); 
				System.out.println("Enter your prenom ");
				prenom = myInput.next();
				System.out.println("Enter your age ");
				age = myInput.nextInt();
				System.out.println("Enter your salaire ");
				salaire = myInput.nextDouble();
				Employee e;
				e = new Employee(name,prenom,age,salaire,ref);
				employe.Add(e);
				break;
			case 2: 
				System.out.println("Enter your references ");
				ref = myInput.nextInt();
				employe.delete(ref);
				break;
			case 3:
				System.out.println("Enter your references ");
				ref = myInput.nextInt();
				System.out.println("Enter your name ");
				name = myInput.next();
				System.out.println("Enter your prenom ");
				prenom = myInput.next();
				System.out.println("Enter your age ");
				age = myInput.nextInt();
				System.out.println("Enter your salaire ");
				salaire = myInput.nextDouble();
				employe.Edit(name, prenom, age, salaire, ref);
				break;
			case 4: 
				employe.Afficher();
				break;
				default : System.out.println("Error "); break;
				
			
			
			}
		}else if(verification == 2) {
			
switch(choix) {
			
			case 1: 
				System.out.println("Enter your cne ");
				cne = myInput.next();
				System.out.println("Enter your name ");
				name = myInput.next(); 
				System.out.println("Enter your prenom ");
				prenom = myInput.next();
				System.out.println("Enter your age ");
				age = myInput.nextInt();
				System.out.println("Enter your Filiaire ");
				filiaire = myInput.next();
				Etudiant e;
				e = new Etudiant(name,prenom,age,cne,filiaire);
				etudiant.Add(e);
				break;
			case 2: 
				System.out.println("Enter your cne ");
				cne = myInput.next();
				etudiant.delete(cne);
				break;
			case 3:
				System.out.println("Enter your cne ");
				cne = myInput.next();
				System.out.println("Enter your name ");
				name = myInput.next();
				System.out.println("Enter your prenom ");
				prenom = myInput.next();
				System.out.println("Enter your age ");
				age = myInput.nextInt();
				System.out.println("Enter your Filaire ");
				filiaire = myInput.next();
				etudiant.Edit(name, prenom, age,cne,filiaire);
				break;
			case 4: 
				etudiant.Afficher();
				break;
				default : System.out.println("Error "); break;
				
			
			
			}
			
		}else if(verification == 3) {
			
switch(choix) {
			
			case 1: 
				
					System.out.println("Enter your ref ");
					ref = myInput.nextInt();
					
					System.out.println("Enter your price ");
					price = myInput.nextDouble();
					System.out.print("Enter your name ");
					myInput.nextLine();
		            name += myInput.nextLine();
					Book e;
					e = new Book(name,price,ref);
					book.Add(e);
				
				
				break;
			case 2: 
				System.out.println("Enter your ref ");
				ref = myInput.nextInt();
				book.delete(ref);
				break;
			case 3:
				System.out.println("Enter your ref ");
				ref = myInput.nextInt();
				System.out.println("Enter your name ");
				myInput.nextLine();
	            name += myInput.nextLine();
				System.out.println("Enter your price ");
				price = myInput.nextDouble();
				book.Edit(name,ref,price);
				break;
			case 4: 
				book.Afficher();
				break;
				default : System.out.println("Error "); break;
				
			
			
			}
			
		}
		System.out.println("voulez vous quiter 1- oui 2- Non");
		quiter = myInput.nextInt();	
		}	
		System.out.println("Fin programme");

		
		

	}

}
