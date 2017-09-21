package LPS2IMA.ContactBriand;

public interface IContactDao {

	void creerContact(Contact leContact);

	Contact recupererContact(String nom);

	boolean isContactExist(String nom);
	
}
