package LPS2IMA.ContactBriand;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {

    ContactService service = new ContactService();

    public void testCreerContactOk() throws Exception {
        Contact c = new Contact("NomNormal", "telephone");

        service.creerContact("NomNormal", "telephone");
    }

    @Test
    public void testContactServiceCasNomarl() {
        Contact c = new Contact("NomNormal", "0223412868");
        ContactDao CDao = new ContactDao();
        CDao.creerContact(c);

        assertEquals("Erreur ContactService isContactExist cas normal", true, CDao.isContactExist("NomNormal"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactNomTropCourt() throws Exception {
        service.creerContact("Aa", "0667871635");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactNomNull() throws Exception {
        service.creerContact(null, "0667871635");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactNomTropLong() throws Exception {
        // TODO
        service.creerContact("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "0667871635");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactNomPasEnLettre() throws Exception {
        // TODO
        service.creerContact("az123", "0667871635");
    }

}
