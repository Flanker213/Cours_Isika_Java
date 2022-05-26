package fr.isika.cda10.temperature.app;

import java.util.Scanner;

// package 1 fois
// imports 0 ou plusieurs

public class TemperatureApp {

	public static void main(String[] args) {
		
		/*
		 * si temp�rature inf�rieur � 0 - eau g�l�e
		 * sinon si entre 0 et 100 - liquide
		 * sinon si sup � 100 - vapeur
		 */
		
		// saisi de la temp�rature au clavier
		System.out.println("Veuillez saisir la temp�rature :");
		Scanner scanner = new Scanner(System.in);
		int temperature = scanner.nextInt();
		

		
		// condition
		if(temperature <= 0){
			System.out.println("La temp�rateur de l'eau est de " + temperature + "�, l'eau est g�l�e !");
		}else if(temperature >0 && temperature <100){
			System.out.println("La temp�rateur de l'eau est de " + temperature + "�, l'eau est liquide !");
		}else{
			System.out.println("La temp�rateur de l'eau est de " + temperature + "�, l'eau s'est vaporis�e !");
		}
		scanner.close();
	}
}
