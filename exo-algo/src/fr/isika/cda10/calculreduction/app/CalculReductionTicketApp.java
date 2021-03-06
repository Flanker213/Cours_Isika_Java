package fr.isika.cda10.calculreduction.app;

import java.util.Scanner;

public class CalculReductionTicketApp {

	public static void main(String[] args) {
		/*
		 * Ecrire un programme permettant de calculer le prix d'un ticket
		 * de spectacle (prix unitaire de votre choix) et d'y appliquer une r?duction
		 * en fonction de l'?ge (ou la cat?gorie) d'une personne.
		 * 
		 * Les r?gles sont :
		 * - prixAvecReduction : d?cimale (en euro)
		 * - Si age entre 8 et 12 (ou cat?gorie "enfant") : r?duction de 15%
		 * - Si age entre 12 et 25 (ou cat?gorie "jeune") : r?duction de 10%
		 * - Si age est sup?rieur ? 60 (ou cat?gorie "s?nior") : r?duction de 20%
		 * 
		 * - Pour les adultes pas de r?duction.
		 */
		
		// saisi de la cta?gorie de r?duction au clavier
		System.out.println("Veuillez saisir votre cat?gorie de r?duction :");
		Scanner scanner = new Scanner(System.in);
		String categoriePersonne = scanner.next();
		
		// initialisation des variable de prix et r?duction ? appliquer
		float reduction = 0;
		float prix = 10f;
		
		switch(categoriePersonne) {
		case "Enfant" :
			reduction = 1.5f;
			break;
		case "Jeune" :
			reduction = 1;
			break;
		case "Senior" :
			reduction = 2;
			break;
		default :
			System.out.println("Vous ne b?n?ficiez pas de r?duction");
			break;
		}
		
		// code commun
		System.out.println("Prix avec r?duction pour la cat?gorie : " 
		+ categoriePersonne 
		+ " = " 
		+ (prix - reduction)
		+ " euros") ;
		scanner.close();
	}
}
