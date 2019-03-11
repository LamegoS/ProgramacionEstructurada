package ProgramasVariosCaminos;

import java.util.Scanner;

public class IgualDistinto
{
    public static void IgualDistinto()
    {
        System.out.println("Ingresa numero 1: ");
        Scanner datos = new Scanner (System.in);
        int N1 = datos.nextInt();
        System.out.println("Ingresa numero 2: ");
        int N2 = datos.nextInt();
        System.out.println("Ingresa numero 3: ");
        int N3 = datos.nextInt();
        
        int suma = N1 + N2 + N3;
        int promedio = ((N1 + N2 + N3)/3);
        int producto = ((N1 * N2) * N3);
        
        System.out.println("La suma de los numeros es  " + suma );
        System.out.println("El promedio de los numeros es  " + promedio );
        System.out.println("El producto de los numeros es  " + producto );
     
        if(N1 > N2 && N1 > N3)
            System.out.println("El numero mayor es " + N1);
        else
        if(N2 > N1 && N2 > N3)
            System.out.println("El numero mayor es " + N2);
        else
            System.out.println("El numero mayor es " + N3);
 }   
}
