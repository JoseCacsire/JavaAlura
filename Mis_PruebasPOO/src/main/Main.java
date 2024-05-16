package main;

import clases.NivelEstudio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NivelEstudio[] niveles = NivelEstudio.values();
		//esto es igual a lo de abajo
		System.out.println(NivelEstudio.values()[1]);
		System.out.println(niveles[0]);
	}

}
