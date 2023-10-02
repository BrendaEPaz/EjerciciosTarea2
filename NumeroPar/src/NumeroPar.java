//Verifica si un número es par o múltiplo de 5
import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es par o múltiplo de 5: ");
        int num = sc.nextInt();

        if ((num%2==0)&&(num%5==0)){
            System.out.println("El número "+num+" es par y también múltiplo de 5");
        }
        else {
            if (num%2==0){
                System.out.println("El número "+num+" es par y no es múltiplo de 5");
            }
            else if (num%5==0) {
                System.out.println("El número "+num+" es múltiplo de 5 y no es par");
            }
        }
        sc.close();
    }

}
