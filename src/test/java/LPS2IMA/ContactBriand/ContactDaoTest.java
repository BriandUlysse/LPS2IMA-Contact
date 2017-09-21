package LPS2IMA.ContactBriand;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContactDaoTest {

    @Test
    public void testContactDaoRecupererContact() {
        Contact c = new Contact("NomNormal", "telephone");
        ContactDao CDao = new ContactDao();
        CDao.creerContact(c);

        assertEquals("Erreur ContactDao, recupererContact", "telephone",
                CDao.recupererContact("NomNormal").getTelephone());
        assertEquals("Erreur ContactDao, recupererContact cas Contact inexistant", null,
                CDao.recupererContact("NomNormal2"));
    }

    @Test
    public void testContactDaoIsContactExist() {
        Contact c = new Contact("NomNormal", "telephone");
        ContactDao CDao = new ContactDao();
        CDao.creerContact(c);

        assertEquals("Erreur ContactDao, isContactExist cas normal", true, CDao.isContactExist("NomNormal"));
        assertEquals("Erreur ContactDao, isContactExist cas contact inexistant", false,
                CDao.isContactExist("NomNormal2"));
    }
}
