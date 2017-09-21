package LPS2IMA.ContactBriand;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {

	public static void main(String[] args){
		
		//Test unitaire du constructeur
		System.out.println("--Test contact");
		
	}
	
	@Test
	public void testContactNormal() {
		Contact c = new Contact("NomNormal","telephone");
		assertEquals("Erreur Contact, getNom, cas normal","NomNormal",c.getNom());
		assertEquals("Erreur Contact, getTelephone cas normal","telephone",c.getTelephone());
		
		c = new Contact("nom","telephone");
		assertEquals("Erreur Contact, getNom, nom =3","nom",c.getNom());
		assertEquals("Erreur Contact, getTelephone, nom =3","telephone",c.getTelephone());
		
		c = new Contact("azertyuiopazertyuiopazertyuiopazertyuiop","telephone");
		assertEquals("Erreur Contact, getNom, nom =40","azertyuiopazertyuiopazertyuiopazertyuiop",c.getNom());
		assertEquals("Erreur Contact, getTelephone, nom =40","telephone",c.getTelephone());
	}
	
	
	
	
}
