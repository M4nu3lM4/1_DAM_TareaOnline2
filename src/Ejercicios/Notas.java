package Ejercicios;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Notas {
    public static void main(String[] args) {
        float notaFebrero;
        float notaJunio;

        float notaPonderada;
        do {
            System.out.print("Introduce la primera nota de Febrero: ");
            notaFebrero = Entrada.real();
        } while (notaFebrero < 0 || notaFebrero > 10);

        do {
            System.out.print("Introduce la segunda nota de Junio: ");
            notaJunio = Entrada.real();
        } while (notaJunio < 0 || notaJunio > 10);

        if (notaFebrero >= 4 && notaJunio >= 4) {

            notaFebrero = notaFebrero * ((float) 40 / 100);
            notaJunio = notaJunio * ((float) 60 / 100);
            System.out.println("La nota final es: " + (notaFebrero + notaJunio));

        } else if (notaFebrero < 4 || notaJunio < 4) {

            notaFebrero = notaFebrero * ((float) 40 / 100);
            notaJunio = notaJunio * ((float) 60 / 100);
            notaPonderada = notaFebrero + notaJunio;

            if (notaPonderada >= 4) {
                System.out.println("La nota media es 4");

            } else {
                notaFebrero = notaFebrero * ((float) 40 / 100);
                notaJunio = notaJunio * ((float) 60 / 100);
                System.out.println("La nota final es: " + (notaFebrero + notaJunio));

            }
        }
    }
}