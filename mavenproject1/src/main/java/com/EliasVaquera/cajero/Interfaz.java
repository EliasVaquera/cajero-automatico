package com.EliasVaquera.cajero;

import com.EliasVaquera.cajero.CajeroAutomatico;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {


    public static void main(String[] args) {
        System.out.println("Introduzca su usuario: ");
        Scanner sc= new Scanner(System.in);
        String usuario = sc.nextLine();
        System.out.println("Introduzca su contraseña: ");
        String contraseña = sc.nextLine();
        
        CajeroAutomatico cajero= new CajeroAutomatico(usuario, contraseña);
        
        int op;
       try{
           do {
            System.out.println("Digite el numero de la opcion deseada:");
            System.out.println("1: Saldo");
            System.out.println("2: Deposito");
            System.out.println("3: Extraccion");
            System.out.println("4: Ultimos movimientos");
            System.out.println("5: Salir");
            

            op = sc.nextInt();

            switch (op) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                   cajero.retirarDinero();
                    break;
                case 4:
                  cajero.ultimosMovimientos();
                    break;
                default:
                  System.out.println("Gracias por utilizar nuestros servicios.");

            }
        } while (op== 1 || op==2 || op==3 || op==4);
       }catch (InputMismatchException e){
           System.out.println("Ha ingresado un caracter invalido");
           
                }
       
        }
    }

