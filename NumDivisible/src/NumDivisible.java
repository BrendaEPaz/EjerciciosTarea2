import java.util.Scanner;
public class NumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número para verificar si es divisible por 2 y 3: ");
        int num = sc.nextInt();

        if ((num % 2==0)&&(num % 3==0)){
            System.out.println("El numero " +num+ " es divisible por 2 y 3.");
        }
        else{
            System.out.println("El numero " +num+ " NO es divisible por 2 y 3.");

        }
        sc.close();


    }

}
