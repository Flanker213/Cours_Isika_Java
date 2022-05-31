package fr.isika.cda10.cours.java;

public class Tableaux {

	public static void main(String[] args) {
		
	/*
	 * - Les tableaux sont des objets
	 * - Leur taille est fixe
	 * - Leur taille est allouée dynamiquement par l'utilisation du mot résrvé "new"
	 * - L'accès aux entrées est identique à celle en langage C une fois l'allocation faite
	 * - Erreur d'accès en cas de dépassement de taille
	 * - L'index du tableau commence de 0 jusqu'a N
	 */
		
	/*
	 * Un tableau est une structure de données qui contient plusieurs éléments du même type
	 * 
	 * Un tableau doit être alloué dans la mémoire avec "new" type[n]
	 * - Type : type de la donnée
	 * - N : taille du tableau (déclarée à l'init. car la taille du tableau n'est pas modifiable dynamiquement)
	 * - L'opérateur "new" renvoie une référence vers un tableau (une référence est un identifiant unique d'une structure de données)
	 * 
	 * Les éléments d'un tableau sont accessibles par leur position (index)
	 * - Attention aux positions limites, si un index n'existe pas dans le tableau, une exception de type
	 * ArrayIndexOutOfBoundsException est levée
	 * 
	 * On peut parcourir un tableau avec une boucle for classique ou un forEach
	 */
		
	/*
	 * Accès à la taille du tableau avec : tab.lenght
	 * Accçs à un élément avec tab[indice]
	 */
		
	// Exemple de déclaration de tableaux :
		
		int[] arrayOfInt; // Déclaration de la référence
		arrayOfInt = new int[42]; // Création avec association de taille
		int taille = arrayOfInt.length; // À l’aide de la variable length, nous pouvons obtenir la taille du tableau
		System.out.println(taille); // J'imprime sur ma console la taille de mon tableau
	}

}
