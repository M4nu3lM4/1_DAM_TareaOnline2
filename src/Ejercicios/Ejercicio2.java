package Ejercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;
        int acumulador = 0;
        int resultado;

        do {
            System.out.print("Introduce un número entre 1 y 9 (ambos inclusive): ");
            numero = Entrada.entero();
        } while (numero < 1 || numero > 9);

        for (int i = 1; i <= numero; i++) {
            acumulador = acumulador * 10 + i;
            resultado = 8 * acumulador + i;
            System.out.println("8 * " + acumulador + " + " + i + " = " + resultado);
        }
    }
}

