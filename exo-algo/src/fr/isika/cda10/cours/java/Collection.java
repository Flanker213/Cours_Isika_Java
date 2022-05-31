package fr.isika.cda10.cours.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	
	/*
	 * Les Collection
	 * 
	 * - Collection : interface commune à toutes les collectionns;
	 * - List : interface permettant de gérer une liste;
	 * - Iterator : interface permettant de parcourir une collection;
	 * - Vector : réalisation de liste dans une sorte de tableau à taille variable;
	 * - Map : interface permettant de gérer des tables associant une clén à un objet;
	 * - Hashtable : tableau associatif
	 * 
	 */
	
	// Exemple :
	
	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();
		entiers.add(2);
		entiers.add(3);
		
		System.out.println(entiers.size()); // 2 éléments
		
		Set<String> chaines = new HashSet<>();
		chaines.add("abs");
		chaines.add("abc ");
		
		System.out.println(chaines.size()); // 2 éléments
		
		Map<Integer, String> map = new HashMap<>(); // K clé, V valeur
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(3, "D");
		
		System.out.println(map);// {1=A, 2=B, 3=D}
		
	}
}
