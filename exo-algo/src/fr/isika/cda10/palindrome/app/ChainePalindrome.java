package fr.isika.cda10.palindrome.app;

import java.util.Scanner;

public class ChainePalindrome {
	
	/*
	 * Ecrire un programme Java qui permet de v�rifier si une chaine de caract�res
	 * saisie par l'utilisateur, est une chaine palindrome.
	 * 
	 * Une chaine Palindrome est une chaine de caract�res
	 * qui se lit de la m�me fa�on des deux c�t�s.
	 * 
	 * Exemple : KAYAK, LAVAL, AVA ...
	 */

	public static void main(String[] args) {

		
		System.out.println("Veuillez saisir la cha�ne � tester : ");
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
