package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import main.Utils;

public class PremierTest {
	
	// Particularit� JUnit les m�thodes ne doivent pas �tre static et ne doivent pas prendre de param�tres
	// Ajouter l'annotation @Test pour que ce soit consid�r� comme un test unitair
	
	@Test
	
	/*
	 * Exercice :
	 * 
	 * v�rifie si une valeur est dans un tableau
	 * value : int
	 * array : tableau de x valeurs
	 */
	public void test() {
		//fail("pas encore fait"); // Premi�re m�thode fail pour forcer le test � �tre rouge
		
		int[] array = {2, 3, 5};
		assertFalse(Utils.find(1, array));
		assertFalse(Utils.find(0, array));
		assertTrue(Utils.find(2, array));
		assertTrue(Utils.find(3, array));
		assertTrue(Utils.find(5, array));
		
		assertEquals(5, Utils.sum(2, 3));
		assertEquals(4, Utils.sum(2, 2));
	}

}
