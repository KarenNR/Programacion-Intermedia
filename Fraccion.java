//  @ Date : 24/08/2021
//  @ Author : Karen Garza Treviño

import java.text.*;
import java.util.*;

public class Fraccion {
	private int numerador;
	private int denominador;
   
   // Método constructor
	public Fraccion(int numerador, int denominador) {
	   this.numerador = numerador;
      this.denominador = denominador;
	}
	
	public float obtenerDivision() {
	   return (float) numerador / denominador;
	}
	
	public String toString() {
	   DecimalFormat tresDigitos = new DecimalFormat("0.000");
      return numerador + "/" + denominador + " = " + tresDigitos.format(obtenerDivision());
	}
}

class Principal {

   // Validar denominador
   public static int validar() {
      Scanner s = new Scanner(System.in);
      int d;
      do {
         System.out.print("Escriba el denominador de la fracción: ");
         d = s.nextInt();
      } while (d == 0);
      return d;
   }

   public static void main(String[] args) {
      // Valores fijos
      Fraccion f1 = new Fraccion(4, 5);
      
      // Pedir valor (con validación)
      Scanner s = new Scanner(System.in);
      System.out.print("Escriba el numerador de la fracción: ");
      int n = s.nextInt();
      int d = validar();
      Fraccion f2 = new Fraccion(n, d);
      
      // Imprimir resultados
      System.out.println(f1);
      System.out.println(f2);
   }
}
