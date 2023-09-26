

package com.mycompany.practica1;

import java.util.Scanner;


public class Practica1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero entero");
        int numero = scanner.nextInt();
        
        if (numero % 02 == 0){
        System.out.println("(El numero"+ numero + "es par");
    } else {
            System.out.println("El numero"+ numero + "es impar.");
            
            }
    scanner.close();
    }
    }
        
    
        
        
        
    

