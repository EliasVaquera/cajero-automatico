package com.EliasVaquera.mock;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class GeneradorMovimientos {
    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO="Ingreso de ";
    private static final String RETIRADA= "Retiro de ";
    private static final String PAGO_CON_TARJETA="Pago con tarjeta de ";
    private static final String NOMINA="Ingreso nomina de ";
    private static final String PAGO_RECIBO="Pago de recibo de ";
    
  public  ArrayList<String> obtenerMovimientos (int numeroDeMovimientos, String moneda){
    ArrayList<String> movimientos = new ArrayList<>();
    for (int i = 0; i < numeroDeMovimientos; i++){
    numeroDeMovimientos = obtenerAleatorio(1, 6);
    String tipoDeMovimiento;
    
    switch (numeroDeMovimientos){
        case 1: tipoDeMovimiento = TRANSFERENCIA;
    break;
        case 2: tipoDeMovimiento = INGRESO;
    break;
        case 3: tipoDeMovimiento = RETIRADA;
    break;
        case 4: tipoDeMovimiento = PAGO_CON_TARJETA;
    break;
        case 5: tipoDeMovimiento = NOMINA;
    break;
        default: tipoDeMovimiento = PAGO_RECIBO;
    }
    
       double cantidadAleatoria = obtenerDoubleAleatorio(1.0, 3000.0);
    String movimiento= tipoDeMovimiento +String.format("%.2f", cantidadAleatoria) + " " + moneda;
    movimientos.add(movimiento);
    }
 return movimientos;
    }
    
    private int obtenerAleatorio(int minimo, int maximo){
    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    private double obtenerDoubleAleatorio(double minimo, double maximo){
    return ThreadLocalRandom.current().nextDouble(minimo, maximo + 1);
    }
}
