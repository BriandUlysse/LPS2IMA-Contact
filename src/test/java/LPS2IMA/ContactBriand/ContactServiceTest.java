package LPS2IMA.ContactBriand;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {
	
	ContactService service = new ContactService();
	
	public void testCreerContactOk() throws ContactExistException{
		Contact c = new Contact("NomNormal","telephone");
		
		service.creerContact("NomNormal","telephone");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testContactTropCourt() throws ContactExistException {
		service.creerContact("Aa", "0667871635");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testContactTropNull() throws ContactExistException {
		service.creerContact(null, "0667871635");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testContactTropLong() throws ContactExistException {
		//TODO
		service.creerContact("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0667871635");
	}
}
