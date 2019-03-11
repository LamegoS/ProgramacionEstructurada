package ProgramasQueIteran;

import java.util.Scanner;

public class Balero {

    public static int PuntosEnsarte(int tipoEnsarte, boolean exito) {
        int puntos = 0;
        if (exito) {
            switch (tipoEnsarte) {
                case 1: //Sencillo y así y así
                    puntos = 1;
                    break;
                case 2:
                    puntos = 5;
                    break;
                case 3:
                    puntos = 10;
                    break;
                case 4:
                    puntos = 10;
                    break;
                case 5:
                    puntos = 50;
                    break;
                case 6:
                    puntos = 100;
                    break;
                case 7:
                    puntos = 250;
                    break;
                case 8:
                    puntos = 500;
                    break;

            }
        } else {
            return 0;
        }
        return puntos;
    }

    public static void Torneo() 
        {
            Scanner entradaTeclado = new Scanner(System.in);
            int numJugadores = 2;
            int numEnsartes;
            int puntosjugador1 = 0, puntosjugador2 = 0, tipoEnsarteAIntentar;
            int i, j;
            boolean exito;
            System.out.println("Numero ensartes a intentar: ");
            numEnsartes = entradaTeclado.nextInt();
            for (i = 1; i <= numEnsartes; i++) {
                for (j = 1; j <= 2; j++) {
                    System.out.println("1.Sencillo ");
                    System.out.println("2.Capirucho sencillo ");
                    System.out.println("3.Clasico ");
                    System.out.println("4.Capirucho complicado ");
                    System.out.println("5.Cruzado ");
                    System.out.println("6.Reves ");
                    System.out.println("7.Jalon ");
                    System.out.println("8.Invertido ");
                    System.out.println("Jugador: " + j);
                    System.out.println("Oportunidad: " + i);
                    System.out.println("Tipo de ensarte a intentar");
                    tipoEnsarteAIntentar = entradaTeclado.nextInt();
                    System.out.println("Hubo exito ");
                    exito = entradaTeclado.nextBoolean();
                    if (j == 1) {
                        puntosjugador1 += PuntosEnsarte(tipoEnsarteAIntentar, exito);
                    } else {
                        puntosjugador2 += PuntosEnsarte(tipoEnsarteAIntentar, exito);
                    }
                }
            }

            // for (i = 1;i <= 2; i++)
            System.out.println("El jugador 1 obtuvo " + puntosjugador1);
            System.out.println("El jugador 2 obtuvo " + puntosjugador2);
        }
}
