package ProgramasConjuntoDeDatos;

import java.util.Scanner;

public class CadToAltas 
{
    public static void Transformacion() 
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una oracion");
        String oracion = teclado.nextLine();
        char[] oracionArray = oracion.toCharArray();
        for (int i = 0; i < oracion.length(); i++) 
        {
        char c = (char) oracion.charAt(i);

            if (c >= 'a' && c <= 'z' || c == ' ') 
            { //MINUSCULA -> MANTIENE
                System.out.print(c);
            } else if (c >= 'A' && c <= 'Z' || c == ' ') 
            { // PASAR A MINUSCULA
                c = (char) (c + 'a' - 'A');
                System.out.print(c);

            }
        }
    
    }
}