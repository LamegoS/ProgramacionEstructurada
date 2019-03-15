package ProgramasQueIteran;

import java.util.Scanner;

public class Cambio 
{
    public static void Maquina()
    {
        Scanner entradaTeclado = new Scanner(System.in);
        int monto, cambio, faltante, recibido; 
         int Hi = 0, Fr = 0, SJ= 0, Q = 0, JM = 0, B = 0; 
         int M10 = 0,M5 = 0, M2 = 0, M1 = 0;
        System.out.println("Ingrese monto a pagar");
        monto = entradaTeclado.nextInt();
        System.out.println("Ingrese pago del monto segun corresponda");
        System.out.println("Billetes de 1000");
        int Mil = entradaTeclado.nextInt();
        System.out.println("Billetes de 500");
        int Qui = entradaTeclado.nextInt();
        System.out.println("Billetes de 200");
        int Dosc = entradaTeclado.nextInt();
        System.out.println("Billetes de 100");
        int Cien = entradaTeclado.nextInt();
        System.out.println("Billetes de 50");
        int Cin = entradaTeclado.nextInt();
        System.out.println("Billetes de 20");
        int Vei = entradaTeclado.nextInt();
        System.out.println("Monedas de 10");
        int Di = entradaTeclado.nextInt();
        System.out.println("Monedas de 5");
        int Cinco = entradaTeclado.nextInt();
        System.out.println("Monedas de 2");
        int Dos = entradaTeclado.nextInt();
        System.out.println("Monedas de 1");
        int Uno = entradaTeclado.nextInt();
        recibido = (Mil *1000)+ (Qui* 500)+(Dosc * 200)+(Cien *100)+(Cin*50)+(Vei*20)+(Di*10)+(Cinco*5)+(Dos*2)+(Uno*1);
        faltante = monto - recibido;
        cambio = recibido - monto; 
        if ((monto - recibido) == 0)
            System.out.println("El pago está completo");
        else 
            if (monto > recibido)
                System.out.println("El pago NO está completo, faltan: " + faltante);
            else 
                if (monto < recibido)
                { 
                    Hi = cambio/1000;
                    cambio = cambio - (Hi*1000);
                    Fr = cambio/500;
                    cambio = cambio - (Fr*500);
                    SJ = cambio/200;
                    cambio = cambio - (SJ*200);
                    Q = cambio/100;
                    cambio = cambio - (Q*100);
                    JM = cambio/50;
                    cambio = cambio - (JM*50);
                    B = cambio/1000;
                    cambio = cambio - (B*20);
                    M10 = cambio/10;
                    cambio = cambio - (M10*10);
                    M5 = cambio/5;
                    cambio = cambio - (M5*5);
                    M2 = cambio/2;
                    cambio = cambio - (M2*2);
                    M1 = cambio/1;
                    cambio = cambio - (M1*1);
                    
                    System.out.println("Su cambio: " );

                    System.out.println();
                    if (Hi> 0)
                        System.out.println("Billetes de 1000: " + Hi);
                    if (Fr> 0)
                        System.out.println("Billetes de 500:" + Fr);
                    if (SJ> 0)
                        System.out.println("Billetes de 200: " + SJ);
                    if (Q> 0)
                        System.out.println("Billetes de 100: " + Q);
                    if (JM> 0)
                        System.out.println("Billetes de 50: " + JM);
                    if (B> 0)
                        System.out.println("Billetes de 20: " + B);
                    if (M10> 0)
                        System.out.println("Monedas de 10: " + M10);
                    if (M5> 0)
                        System.out.println("Monedas de 5:" + M5);
                    if (M2> 0)
                        System.out.println("Monedas de 2: " + M2);
                    if (M1> 0)
                        System.out.println("Monedas de 1:" + M1);

                }
        
            
        
    }
}
