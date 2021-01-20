package fr.afpa.collection.gestionecole.presentation;

import java.time.LocalDate;
import java.time.Period;
import fr.afpa.collection.gestionecole.dao.EleveService;
import fr.afpa.collection.gestionecole.dao.SalleService;
import fr.afpa.collection.gestionecole.metier.Adresse;
import fr.afpa.collection.gestionecole.metier.Eleve;
import fr.afpa.collection.gestionecole.metier.Salle;

public class Ecole {

	public static void main(String[] args) {

	
	// le code au dessus est �quivalent � 
	SalleService salleService = new SalleService() ;
	
	salleService.create(new Salle("mat","Math�matiques"));
	salleService.create(new Salle("Phy","Physique"));
	salleService.create(new Salle("Inf","Informatique"));
	salleService.create(new Salle("Art","Art Plastique"));
	salleService.create(new Salle("Fr","Fran�ais"));
	salleService.afficheListeSalles();
	 salleService.delete(salleService.findById(2)) ;
	salleService.salles.remove(2) ;
	System.out.println("Liste des salles apr�s suppression de la salle  id= 2 :");
	salleService.afficheListeSalles();
	
	System.out.println("Modifier la salle informatique :");
	
	Salle laSalleInformatique = salleService.findByName("Informatique") ;
	if(laSalleInformatique != null) {
		laSalleInformatique.setLibelle("Computer Science");
		salleService.update(laSalleInformatique);
	} else {
		System.out.println("La salle n'existe pas");
	}
	salleService.afficheListeSalles();
	// le code au dessus est �quivalent � 
	EleveService eleveService = new EleveService() ;
	
	LocalDate dateNaissance = LocalDate.of(1998, 01, 22) ;
	int age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Dupont", "Fran�ois", dateNaissance, age, 
			new Adresse(12,"Oliviers", 75001,"Paris", "France") )) ; 
	
	dateNaissance = LocalDate.of(2008, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Duhamel", "Francis", dateNaissance, age, 
			new Adresse(12,"Oliviers", 75001,"Paris", "France") )) ; 
	

	dateNaissance = LocalDate.of(1990, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	
	eleveService.create(new Eleve("Dupont", "Brigitte", dateNaissance, age, 
			new Adresse(12,"Oliviers", 75001,"Paris", "France") )) ; 

	dateNaissance = LocalDate.of(1992, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Dupont", "Alex", dateNaissance, age, 
			new Adresse(12,"Oliviers", 75001,"Paris", "France") )) ; 

	dateNaissance = LocalDate.of(1986, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Trad", "Antoine", dateNaissance, age, 
			new Adresse(12,"Oliviers", 75001,"Paris", "France") )) ; 

	dateNaissance = LocalDate.of(1975, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Dupont", "Fran�ois", dateNaissance, age, 
			new Adresse(12,"Roses", 75001,"Ramzi", "France") )) ; 

	dateNaissance = LocalDate.of(1966, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Dupont", "Radouane", dateNaissance, age, 
			new Adresse(18,"Oliviers", 75001,"Paris", "France") )) ; 

	dateNaissance = LocalDate.of(2000, 01, 22) ;
	age = Period.between(dateNaissance, LocalDate.now()).getYears() ;
	
	eleveService.create(new Eleve("Dupont", "Brigitte", dateNaissance, age, 
			new Adresse(10,"Palmiers", 75001,"Paris", "France") )) ; 
	
	System.out.println( eleveService.toString());
	
	Eleve alex = eleveService.findByFirstName("Alex") ;
	alex.setNom("Antoine");
	eleveService.update(alex) ;
	System.out.println( eleveService.toString());
	
	for(int i =0 ; i<eleveService.findAll().size() ; i++ ) {
		Eleve br = eleveService.findByFirstName("Brigitte") ;
		if (br!= null)
			eleveService.delete(br);
		}
		System.out.println( eleveService.toString());
	}

}
