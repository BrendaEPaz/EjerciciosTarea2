import java.util.Scanner;
public class Num5y10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es mayor que 5 y menor que 10 o es mayor que 20 y menor que 30");
        int num = sc.nextInt();

        if ((num>5)&&(num<10)){
            System.out.println("El número es mayor que 5 y menor que 10.");
        }
        else if ((num>20)&&(num<30)) {
            System.out.println("El número es mayor que 20 y menor que 30.");
        }
        else {
            System.out.println("El número no entra en ninguno de los dos rangos");
        }
        sc.close();
    }
}
