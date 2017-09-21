package LPS2IMA.ContactBriand;

public class Contact {
	private String nom;
	private String telephone;
	
	public Contact(String _nom,String  _telephone) {
		
			this.nom = _nom;
			this.telephone = _telephone;
		
		
	}
	
	public String getNom() {return this.nom;}
	public String getTelephone() {return this.telephone;}
}
