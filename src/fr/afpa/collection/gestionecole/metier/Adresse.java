package fr.afpa.collection.gestionecole.metier;

/*
 * D�finir une classe Adresse  avec les attributs suivants: 
 * numRue , nomRue , codePostale, Ville , Pays.

 * */
public class Adresse {
	int numRue ;
	String nomRue  ; 
	int codePostale ; 
	String ville  ; 
	String pays ;
	
	
	

	


	public Adresse(int numRue, String nomRue, int codePostale, String ville, String pays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
	}




	public int getNumRue() {
		return numRue;
	}




	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}




	public String getNomRue() {
		return nomRue;
	}



	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}



	public int getCodePostale() {
		return codePostale;
	}



	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getPays() {
		return pays;
	}



	public void setPays(String pays) {
		this.pays = pays;
	}




	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", nomRue=" + nomRue + ", codePostale=" + codePostale + ", ville=" + ville
				+ ", pays=" + pays + "]";
	}
	
	
	
	
	
	
}
