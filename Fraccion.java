//  @ Date : 31/08/2021
//  @ Author : Karen Garza Treviño

import java.text.*;
import java.util.*;

public class Fraccion {
	private float numerador;
	private float denominador;
   
   // Método constructor
	public Fraccion(float numerador, float denominador) {
	   setNumerador(numerador);
      setDenominador(denominador);
	}
   
   // Sets y gets
   public void setNumerador(float numerador) {
      this.numerador = numerador;
   }
   public float getNumerador() {
      return numerador;
   }
   
   public void setDenominador(float denominador) {
      this.denominador = denominador;
   }
   public float getDenominador() {
      return denominador;
   }
	
   // Obtener la división del numerador y del denominador
	public float obtenerDivision() {
	   return numerador / denominador;
	}
	
	public String toString() {
	   DecimalFormat tresDigitos = new DecimalFormat("0.000");
      return (int) numerador + "/" + (int) denominador + " = " + tresDigitos.format(obtenerDivision());
	}
}

class Principal {

   // Validar denominador
   public static float validar() {
      Scanner s = new Scanner(System.in);
      float d;
      do {
         System.out.print("Escriba el denominador de la fracción: ");
         d = s.nextFloat();
      } while (d == 0);
      return d;
   }

   public static void main(String[] args) {      
      // Pedir valor (con validación)
      Scanner s = new Scanner(System.in);
      System.out.print("Escriba el numerador de la fracción: ");
      float n = s.nextInt();
      float d = validar();
      Fraccion f1 = new Fraccion(n, d);
      
      // Imprimir con gets
      System.out.println("Numerador: " + (int) f1.getNumerador());
      System.out.println("Denominador: " + (int) f1.getDenominador());
      
      // Imprimir con toString
      System.out.println(f1);
   }
}
