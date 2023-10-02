import java.util.Scanner;
public class NegativoCero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número para verificar si es negativo o cero: ");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("El número es positivo");
        } else if (num<0) {
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número es cero.");
        }
        sc.close();
    }

}
