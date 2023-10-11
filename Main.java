import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    System.out.println("Ingresar la cantidad de numeros de la serie Finobacci");
        int n = scanner.nextInt();

        if (n <=0)
            System.out.println("La cantidad de numeros debe ser un entero")
                }  else 
    {
            int[] FinobacciSeries = new int[n];
        
        //Iniciar los primeros numeros de la serie
        FinobacciSeries[0] = 0;
        if (n > 1)
            FinobacciSeries[1] = 1;

        //Generamos la serie Finobacci
        for (int i = 2; i < n;i++)
            FinobacciSeries[i] = FinobacciSeries[i - 1]+ FinobacciSeries[i - 2];

        System.out.println("Serie Finobacci de los primeros"+ n + "numeros");

        for (int i = 0; i < n; i++)
            System.out.print(FinobacciSeries[i] + "");

        scanner.close();
    }
}