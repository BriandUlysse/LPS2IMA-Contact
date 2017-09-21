package LPS2IMA.ContactBriand;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

public class ContactServiceMockTest extends MockTest {
	
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDao dao;
	
	//On déclare que le test doit lever l'exception "ContactExist"
	@Test(expected=ContactExistException.class)
	public void testCasContactDoublon() throws ContactExistException{
		//Phase d'enregistrement des comportements du mock
		String nom ="contact";
		// On attend l'appel a isContactExist avec la valeur "contact"
		// On a configuré le mock pour qu'il réponde True
		// On simule que le contact "Contact" existe en base de données
		EasyMock.expect(dao.isContactExist(nom)).andReturn(true);
		
		//FIn de la phase d'enregistrement
		
		replayAll();
		//Appel du service
		
		service.creerContact(nom, "06666666");
	}
	
	//On déclare que le test ne doit pas lever l'exception "ContactExist"
	@Test
	public void testCasContactValide() throws ContactExistException{
		//SETUP 
		
		//Phase d'enregistrement des comportements du mock
		String nom ="contact";
		// On attend l'appel a isContactExist avec la valeur "contact"
		// On a configuré le mock pour qu'il réponde FALSE
		// On simule que le contact "Contact" n'existe pas en base de données
		EasyMock.expect(dao.isContactExist(nom)).andReturn(false);
		
		//On attend l'appel a dao.creerContact et on capture l'obje
		// qui est passé à la méthode afin de controler les champs
		Capture<Contact> captureContact = EasyMock.newCapture();
		dao.creerContact(EasyMock.capture(captureContact));
		
		//FIn de la phase d'enregistrement
		replayAll();
		
		//Appel du service
		// EXECUTION DE LA METHODE DE SERVICE A TESTER 
		String telephone = "06666666";
		service.creerContact(nom, telephone);
		
		// VERIFICATION DU TEST
		verifyAll();
		//COntact créé par le service et passé en paramètre au DAO
		Contact contactCree = captureContact.getValue();
		org.junit.Assert.assertEquals(nom, contactCree.getNom());
		org.junit.Assert.assertEquals(telephone, contactCree.getTelephone());
	}
}
