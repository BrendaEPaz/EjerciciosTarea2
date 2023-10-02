import java.util.Scanner;
public class Multiplo3y5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para comprobar si es múltiplo de 3 y no es múltiplo de 5: ");
        int num=sc.nextInt();

        if ((num%3==0)&(num%5!=0)){
            System.out.println("El número "+num+" es múltiplo de 3 y no es múltiplo de 5");
        }
        else if ((num%3!=0)&&(num%5==0)){
            System.out.println("El número "+num+" no es múltiplo de 3 y sí es un múltiplo de 5");
        } else if ((num%3==0)&&(num%5==0)) {
            System.out.println("El número "+num+" es múltiplo de 3 y de 5");
        } else {
            System.out.println("El número no es múltiplo de 3 ni de 5");
        }
        sc.close();
    }
}
