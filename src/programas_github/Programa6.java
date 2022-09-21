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
public class Programa6 {
    
 public static void main(String[] args) {
 System.out.println("Ingrese 5 numeros para multiplicar");
 Scanner sc = new Scanner(System.in);
 int Mul = 1;
 for (int i = 0; i < 5; i++) {
 int ni = sc.nextInt();
 Mul = Mul * ni;
 }
 System.out.println("El producto es : " + Mul );
 }
}

