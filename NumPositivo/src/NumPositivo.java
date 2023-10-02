import java.util.Scanner;
public class NumPositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para comprobar si es positivo y no es cero: ");
        int num = sc.nextInt();

        if (num>=1){
            System.out.println("El número que ingresaste es positivo y no es cero.");
        }
        else if (num==0) {
            System.out.println("El número que ingresaste es cero.");
        }
        else {
            System.out.println("El número que ingresaste es negativo.");
        }
        sc.close();
    }
}
