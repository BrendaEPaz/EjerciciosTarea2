import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número a verificar: ");
        int num = sc.nextInt();
        if (num>10){
            if (num<20){
                System.out.println("El número "+num+" es mayor a 10 y menor a 20");
            }
        }
        else{
            System.out.println("El número "+num+" no es mayor a 10 y menor a 20");
        }
        sc.close();
    }
}