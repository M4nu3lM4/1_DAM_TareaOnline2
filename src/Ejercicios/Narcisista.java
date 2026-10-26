package Ejercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Narcisista {
    public static void main(String[] args) {
        int numero;
        int total = 0;

        do {
            System.out.print("Introduce un número entre 100 y 999 (Ambos inclusive): ");
            numero = Entrada.entero();
        } while (numero < 100 || numero >= 1000);

        int numeroCifras = (int) Math.log10(numero) + 1;

        for (int i = 0; i < numeroCifras; i++) {
            int cifra = numero / (int) Math.pow(10, i) % 10;
            total += (int) Math.pow(cifra, 3);
        }
        if (numero == total) {
            System.out.println("El numero: " + numero + " ES narcisista");
        } else {
            System.out.println("El numero: " + numero + " NO es narcisista");
        }
    }
}
