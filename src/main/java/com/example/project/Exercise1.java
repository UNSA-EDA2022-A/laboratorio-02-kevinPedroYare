package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		//iniciamos un auxiliar que empieze en 1 que sera nuestro numero de para verificar
		//si es raiz de numero
		int aux = 1;
		//verificamos si con el primer auxiliar es raiz de numero
		if(aux*aux == numero){
			//si es raiz de numero entonces retornamos true
			return true;
		}else{
			//caso contrario llamara al otro metodo con la condicion extra el numero y el aux aumentado en 1
			return esCuadradoPerfecto(numero,aux+1);
		}
	}
	//se añadio otro metodo similar al anterior, pero con una condicion extra
	public boolean esCuadradoPerfecto(int numero, int aux) {
		//silimar al anterior verificamos si con el auxiliar es raiz de numero
		if(aux*aux == numero){
			return true;
		}
		//aca vemos si ya el aux al cuadrado es mayor al numero base o es 0 retornara false
		else if(aux*aux > numero || numero == 0){
			return false;
		}else{
			//retornara el numero y el auxiliar aumentado en 1 si no se cumplio lo demas haciendo recursividad
			return esCuadradoPerfecto(numero,aux+1);
		}
	}
}
