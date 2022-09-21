/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas_github;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Programa7 {
    
 public static void main(String[] args) {
 
     System.out.println("Ingrese 10 numeros");
 
 Scanner sc = new Scanner(System.in);
 
 int Suma1 = 0;
 int Suma2 = 0;
 for (int i = 0; i < 10; i++) {
 int ni = sc.nextInt();
 if (i < 5) {
     
 Suma1 = Suma1 + ni;
 } else {
 Suma2 = Suma2 + ni;
 }
 }
 
 System.out.println("La suma de los 5 primeros numeros es : " + Suma1 );
 System.out.println("La suma de los 5 ultimos numeros es : " + Suma2 );
 System.out.println("El producto es : " + (Suma1 * Suma2) );
 }
}