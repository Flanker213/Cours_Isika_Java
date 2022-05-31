package fr.isika.cda10.palindrome.app;

import java.util.Scanner;

public class ChainePalindrome {
	
	/*
	 * Ecrire un programme Java qui permet de vérifier si une chaine de caractères
	 * saisie par l'utilisateur, est une chaine palindrome.
	 * 
	 * Une chaine Palindrome est une chaine de caractères
	 * qui se lit de la même façon des deux côtés.
	 * 
	 * Exemple : KAYAK, LAVAL, AVA ...
	 */

	public static void main(String[] args) {

		
		System.out.println("Veuillez saisir la chaîne à tester : ");
		Scanner scanner = new Scanner(System.in);
		String chaine = scanner.next();
		
		System.out.println(palindrome(chaine));
		
		scanner.close();
	}
	
	public static boolean palindrome(String chaine) {
		
		Boolean palindrome = true;
		
		for(int i=0; i<chaine.length()/2; i++) {
			if(!(chaine.charAt(i)==chaine.charAt(chaine.length()-i-1))) {
				palindrome=false;
				break;
			}
		}
		return palindrome;
	}

}
