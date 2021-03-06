package fr.isika.cda10.nombresintervalles.app;

import java.util.Scanner;

public class NombresEtIntervalles {

	public static void main(String[] args) {
		/*
		 * Exercice : Structures conditonnelles avec prédicats
		 * 
		 *  - Ecrire un programme qui permet de d�terminer si une valeur appartient � un intervalle.
		 *    Pour l'exercice, les valeurs seront fixées dans le programme.
		 *
		 * VARIANTE A FAIRE AUSSI (pas corrigée)
		 * 	- Le même programme doit aussi pouvoir déterminer si deux intervalles se coupent, avec tous les cas de figure pris en compte.
		 * 
		 *   Considérez les intervalles : 
		 *      
		 *   [ firstIntervalMinLimit, firstIntervalMaxLimit ]
		 *   [ secondIntervalMinLimit, secondIntervalMaxLimit ] 
		 */
		
		System.out.println("Veuillez saisir la valeur à tester :");
		Scanner scanner1 = new Scanner(System.in);
		int valeur = scanner1.nextInt();
		
		System.out.println("Veuillez saisir la limite minimale de votre intervalle :");
		Scanner scanner2 = new Scanner(System.in);
		int minLimit = scanner2.nextInt();
		
		System.out.println("Veuillez saisir la limite maximale de votre intervalle :");
		Scanner scanner3 = new Scanner(System.in);
		int maxLimit = scanner3.nextInt();
		
		if(valeur >= minLimit) {
			if(valeur <= maxLimit) {
				System.out.println(valeur + " est dans l'intervalle entre " + minLimit + " et " + maxLimit);
			}else if(valeur < minLimit) {
				System.out.println(valeur + " est inférieur à l'intervalle minimale de " + minLimit);
			}else if(valeur > maxLimit) {
				System.out.println(valeur + " est supérieur à l'intervalle maximale de " + maxLimit);
			}
		}
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}
}
