/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas_github;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Programa3 {
    
 public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);//Importamos nuestra clase Scanner
        
        int suma = 0;//Creamos una variable de tipo entero y la inicializamos. Le damos el valor de 0
        
        for (int i = 0; i<5;i++){//Creamos nuestro bucle
            
            System.out.println("Introduce un numero: ");//Pedimos números
            int numero = teclado.nextInt();//Creamos una variable de tipo entero
            suma = suma + numero;//Usamos la lógica
          
            
        }
        
        System.out.println("La suma es: " + suma);
        
    }

}
