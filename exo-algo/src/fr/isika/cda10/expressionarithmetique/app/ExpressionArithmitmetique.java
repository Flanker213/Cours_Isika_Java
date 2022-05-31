package fr.isika.cda10.expressionarithmetique.app;

import java.util.Scanner;

public class ExpressionArithmitmetique {

	public static void main(String[] args) {
		/*
		 * Ecrire l'algorithme qui permet de saisir deux nombres, 
		 * et un op�rateur et d'�valuer  l'expression arithm�tique correspondante.
		 * Par exemple : 
		 * lire "3"
		 * lire "5"
		 * lire "+" 
		 * et ex�cuter l'instruction 3 + 5 
		 * et afficher le r�sultat comme suit : "3 + 5 = 8"
		 */
		
		System.out.println("Veuillez saisir un premier nombre � additionner :");
		Scanner scanner1 = new Scanner(System.in);
		int a = scanner1.nextInt();
		
		System.out.println("Veuillez saisir un second nombre � additionner :");
		Scanner scanner2 = new Scanner(System.in);
		int b = scanner2.nextInt();
		
		int c = a + b;
		
		System.out.println("Voici le r�sultat de votre addition : "+ a + " + " + b + " = " + c);
		
		scanner1.close();
		scanner2.close();
	}
}
