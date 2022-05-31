package main;

public class Utils {
	
	public static boolean find(int element, int[] array) {
		int i = 0;
		boolean exists = false;
		while(!exists && i < array.length) {
			if (element == array[i])
				exists = true;
		
			i++;
		}
		return exists;
	}
	
	public static int sum(int i, int j) {
		return i + j;
	}

}
