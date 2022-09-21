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
public class Programa5 {
    
 public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer= new Scanner(System.in);

        float notas ;
        float suma = 0;
        float promedio;
        int a;


        for(a=1;a<=5;a++)

        {  
          System.out.println("ingresa la nota:"+a+"");
          notas=leer.nextFloat();
          suma=suma+notas;   //formula


        } 


        promedio=suma/(a-1);
        System.out.println("el promedio de las notas es:"+promedio);


        if (promedio >= 5.0)
            System.out.println("El alumno esta aprobado");

        else
            System.out.println("El alumno esta reprobado"); }
    
}

