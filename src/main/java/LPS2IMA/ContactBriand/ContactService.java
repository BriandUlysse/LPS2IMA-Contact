package LPS2IMA.ContactBriand;

public class ContactService {
	
	private IContactDao cDao;

	public ContactService() {
		cDao = new ContactDao();
	}
	
	public void creerContact(String nom,String telephone) throws ContactExistException {
		
		if(nom == null || nom.length()>40 || nom.length()<3) {
			throw new IllegalArgumentException("Le nom doit etre compris entre 3 et 40 caractères");
		}
		
		if(cDao.isContactExist(nom)) {
			throw new ContactExistException();
		}
		Contact contact = new Contact(nom,telephone);
		
		cDao.creerContact(contact);
		
	}
	
}
