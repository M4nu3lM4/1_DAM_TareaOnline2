package Ejercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class DibujarRectangulo {
    public static void main(String[] args) {
        int columna;
        int filas;

        do {
            System.out.println("Introduce un número de filas mayor que 0: ");
            filas = Entrada.entero();
        }while (filas <= 0);

        do {
            System.out.println("Introduce un numero de columnas mayor que 0: ");
            columna = Entrada.entero();
        }while (columna <=0 );

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columna; j++) {


                if (i == 1 || i == filas || j == 1 || j == columna){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
