//  @ Date : 31/08/2021
//  @ Author : Karen Garza Treviño

import java.text.*;
import java.util.*;

public class Fraccion {
	private int numerador;
	private int denominador;
   
   // Método constructor
	public Fraccion(int numerador, int denominador) {
	   setNumerador(numerador);
      setDenominador(denominador);
	}
   
   // Sets y gets
   public void setNumerador(int numerador) {
      this.numerador = numerador;
   }
   public int getNumerador() {
      return numerador;
   }
   
   public void setDenominador(int denominador) {
      this.denominador = denominador;
   }
   public int getDenominador() {
      return denominador;
   }
	
   // Obtener la división del numerador y del denominador
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
      // Pedir valor (con validación)
      Scanner s = new Scanner(System.in);
      System.out.print("Escriba el numerador de la fracción: ");
      int n = s.nextInt();
      int d = validar();
      Fraccion f1 = new Fraccion(n, d);
      
      // Imprimir con gets
      System.out.println("Numerador: " + f1.getNumerador());
      System.out.println("Denominador: " + f1.getDenominador());
      
      // Imprimir con toString
      System.out.println(f1);
   }
}
