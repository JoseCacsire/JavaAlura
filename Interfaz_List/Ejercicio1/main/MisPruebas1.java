package main;

import java.util.ArrayList;

public class MisPruebas1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros1 = new ArrayList<>();
		numeros1.add(1);
		numeros1.add(2);
		ArrayList<Integer> numeros2 = numeros1;
		System.out.println(numeros2);
	}

}
