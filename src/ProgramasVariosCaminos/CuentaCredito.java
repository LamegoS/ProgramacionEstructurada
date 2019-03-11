package ProgramasVariosCaminos;

import java.util.Scanner;

public class CuentaCredito 
{
      public static void Banco()
      {
          int numeroCuenta;               
          double saldoInicio, depositos, cargos, limiteCredito;               
          Scanner entrada = new Scanner(System.in);            
          System.out.println("Introduce el numero de cuenta del cliente:");   
          numeroCuenta = entrada.nextInt();  
         
            System.out.println("Introduce el saldo Inicial:");           
            saldoInicio = entrada.nextDouble();              

            System.out.println("Introduce los depositos hechos:");       
            depositos = entrada.nextDouble();              

            System.out.println("Introduce los cargos:");        
            cargos = entrada.nextDouble();              

            System.out.println("Introduce el limite de credito:" );      
            limiteCredito = entrada.nextDouble();              
            
            double x = (saldoInicio + depositos - cargos);           
            if( x - limiteCredito > 0)           
                System.out.println("El credito se ha excedido.");            
             if( x - limiteCredito < 0)
                System.out.println("El credito es:"+x);  
                            
      }           
      }          
