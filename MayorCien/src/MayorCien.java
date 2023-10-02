import java.util.Scanner;
public class MayorCien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es mayor que 100 o menor que -100");
        int num = sc.nextInt();

        if (num>100){
            System.out.println("El número es mayor que 100");
        } else if (num<-100) {
            System.out.println("El número es menor que -100.");
        } else{
            System.out.println("El número no es mayor que 100 ni menor que -100");
        }
        sc.close();
    }

}
