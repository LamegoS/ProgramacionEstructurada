package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class numPalabras 
{
    public static int nPalabras(String str)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una oracion");
        String oracion = teclado.nextLine();
        String[]palabras= oracion.split(" ");
        System.out.println("Hay: " + palabras.length + " palabras");

            return 0;
    }
   
}
