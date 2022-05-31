package fr.isika.cda10.cours.java;

public class Tableaux {

	public static void main(String[] args) {
		
	/*
	 * - Les tableaux sont des objets
	 * - Leur taille est fixe
	 * - Leur taille est allou�e dynamiquement par l'utilisation du mot r�srv� "new"
	 * - L'acc�s aux entr�es est identique � celle en langage C une fois l'allocation faite
	 * - Erreur d'acc�s en cas de d�passement de taille
	 * - L'index du tableau commence de 0 jusqu'a N
	 */
		
	/*
	 * Un tableau est une structure de donn�es qui contient plusieurs �l�ments du m�me type
	 * 
	 * Un tableau doit �tre allou� dans la m�moire avec "new" type[n]
	 * - Type : type de la donn�e
	 * - N : taille du tableau (d�clar�e � l'init. car la taille du tableau n'est pas modifiable dynamiquement)
	 * - L'op�rateur "new" renvoie une r�f�rence vers un tableau (une r�f�rence est un identifiant unique d'une structure de donn�es)
	 * 
	 * Les �l�ments d'un tableau sont accessibles par leur position (index)
	 * - Attention aux positions limites, si un index n'existe pas dans le tableau, une exception de type
	 * ArrayIndexOutOfBoundsException est lev�e
	 * 
	 * On peut parcourir un tableau avec une boucle for classique ou un forEach
	 */
		
	/*
	 * Acc�s � la taille du tableau avec : tab.lenght
	 * Acc�s � un �l�ment avec tab[indice]
	 */
		
	// Exemple de d�claration de tableaux :
		
		int[] arrayOfInt; // D�claration de la r�f�rence
		arrayOfInt = new int[42]; // Cr�ation avec association de taille
		int taille = arrayOfInt.length; // � l�aide de la variable length, nous pouvons obtenir la taille du tableau
		System.out.println(taille); // J'imprime sur ma console la taille de mon tableau
	}

}
