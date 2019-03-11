package ProgramasVariosCaminos;

import java.util.Scanner;

public class CincoNumeros 
{
    public static void MayorDeCinco() 
    {
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d,e;
        int mayor;
        int menor;

        System.out.print("Ingrese el primer valor:");
        a= entrada.nextInt();

        System.out.print("Ingrese el segundo valor:");
        b= entrada.nextInt();

        System.out.print("Ingrese el tercer valor:");
        c= entrada.nextInt();

        System.out.print("Ingrese el cuarto valor:");
        d= entrada.nextInt();

        System.out.print("Ingrese el quinto valor:");
        e= entrada.nextInt();
        
        if ((a>b&&a>c)&&(a>d&&a>e))
            System.out.printf("%d\t Es el mayor",a );
        else   
            if ((b>a&&b>c)&&(b>d&&b>e))
                System.out.printf("%d\t Es el mayor", b);
        if((c>a&&c>b)&& (c>d&&c>e))
            System.out.printf("%d\t Es el mayor\n",c);
        else 
            if ((e>a&&e>b)&&(e>c&&e>d))
                System.out.printf("%d\t Es el mayor\n",e);
        if ((d>a&&d>b)&& (d>c&&d>e))
            System.out.printf("%d\t Es el mayor\n",d);
 // Número menor
        if ((a<b&&a<c)&&(a<d&&a<e))
            System.out.printf("%d\t Es el menor",a );
        else 
            if ((b<a&&b<c)&&(b<d&&b<e))
                System.out.printf("%d\t Es el menor", b);
        if ((c<a&&c<b)&& (c<d&&c<e))
            System.out.printf("%d\t Es el menor",c);
        else 
            if ((e<a&&e<b)&&(e<c&&e<d))
                System.out.printf("%d\t Es el menor",e);
        if ((d<a&&d<b)&& (d<c&&d<e))
            System.out.printf("%d\t Es el menor",d);
    }    
}



