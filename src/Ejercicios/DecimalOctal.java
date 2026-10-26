package Ejercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DecimalOctal {
    public static void main(String[] args) {
        int numero;
        int cociente = 0;
        int i = 0;

        do {
            System.out.print("Introduce un número positivo: ");
            numero = Entrada.entero();
        } while (numero < 0);

        do {
            cociente = (numero % 8) * (int) Math.pow(10, i) + cociente;
            numero = numero / 8;
            i++;

        } while (numero > 0);

        System.out.println("El numero en octal es: " + cociente);
    }
}
