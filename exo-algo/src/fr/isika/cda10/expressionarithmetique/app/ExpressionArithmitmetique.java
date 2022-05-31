package fr.isika.cda10.expressionarithmetique.app;

import java.util.Scanner;

public class ExpressionArithmitmetique {

	public static void main(String[] args) {
		/*
		 * Ecrire l'algorithme qui permet de saisir deux nombres, 
		 * et un opérateur et d'évaluer  l'expression arithmétique correspondante.
		 * Par exemple : 
		 * lire "3"
		 * lire "5"
		 * lire "+" 
		 * et exécuter l'instruction 3 + 5 
		 * et afficher le résultat comme suit : "3 + 5 = 8"
		 */
		
		System.out.println("Veuillez saisir un premier nombre à additionner :");
		Scanner scanner1 = new Scanner(System.in);
		int a = scanner1.nextInt();
		
		System.out.println("Veuillez saisir un second nombre à additionner :");
		Scanner scanner2 = new Scanner(System.in);
		int b = scanner2.nextInt();
		
		int c = a + b;
		
		System.out.println("Voici le résultat de votre addition : "+ a + " + " + b + " = " + c);
		
		scanner1.close();
		scanner2.close();
	}
}
