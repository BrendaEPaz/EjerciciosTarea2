//Verifica si el alumno aprobó o no.
import java.util.Scanner;
public class Aprobado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu calificación: ");
        int nota = sc.nextInt();

        if ((nota>=60)&(nota<=100)){
            System.out.println("Felicidades! Aprobaste.");
        } else if ((nota<60)&(nota>=0)) {
            System.out.println("No aprobaste :(");
        }
        else {
            System.out.println("El valor que ingresaste no es correcto");
        }
        sc.close();
    }
}
