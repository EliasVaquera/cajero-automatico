package com.EliasVaquera.cajero;


import com.EliasVaquera.mock.GeneradorMovimientos;
import com.EliasVaquera.banco.CuentaBancaria;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;
    
   protected  CajeroAutomatico(String Identificador, String Contraseña){
    double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
     cuentaBancariaActual = new CuentaBancaria("Benito Camelo", cantidadAleatoria); 
    }
    
 protected   void mostrarSaldo(){
    System.out.println("Su saldo actual es: "+ cuentaBancariaActual.obtenerSaldo());
    }
    
  protected  void ingresarDinero(){
    System.out.println("Ingrese el monto a depositar");
    Scanner sc= new Scanner(System.in);
    double monto = sc.nextDouble();
    cuentaBancariaActual.ingresarDinero(monto);}
    
   protected void retirarDinero(){
    System.out.println("Ingrese monto a extraer: ");
    Scanner sc= new Scanner(System.in);
    double monto = sc.nextDouble();
    cuentaBancariaActual.sacarDinero(monto);}
    
   protected  void ultimosMovimientos(){
    GeneradorMovimientos generador = new GeneradorMovimientos();
    System.out.println("¿cuantos movimientos desea consultar?");
    Scanner sc = new Scanner(System.in);
    int numeroDeMovimientos = sc.nextInt();
    ArrayList<String> movimientos = generador.obtenerMovimientos(numeroDeMovimientos, "pesos");
    mostrarMovimientos(movimientos);
    
            }
   private  void mostrarMovimientos(ArrayList<String>movimientos){
    for (String movimiento: movimientos) {
    System.out.println(movimiento);}
    }
    
  protected  void salir(){
   System.out.println("Muchas gracias poor utilizar nuestros servicios.");
   }
}


