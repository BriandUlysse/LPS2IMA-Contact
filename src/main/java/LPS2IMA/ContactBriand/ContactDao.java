package LPS2IMA.ContactBriand;

import java.util.ArrayList;
import java.util.List;

public class ContactDao implements IContactDao {
    private List<Contact> contacts;

    public ContactDao() {
        contacts = new ArrayList<Contact>();
    }

    public void creerContact(Contact leContact) {
        contacts.add(leContact);
    }

    public Contact recupererContact(String nom) {

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getNom().equals(nom)) {
                return contact;

            }
        }
        return null;
    }

    public boolean isContactExist(String nom) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

}
