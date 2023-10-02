//Verificar si un triángulo es isóceles o equilátero.
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el valor del primer lado del tríangulo: ");
        int lado1=sc.nextInt();
        System.out.println("Ingresa el valor del segundo lado del tríangulo: ");
        int lado2=sc.nextInt();
        System.out.println("Ingresa el valor del tercer lado del tríangulo: ");
        int lado3=sc.nextInt();


        if ((lado1==lado2)&&(lado2==lado3)){
            System.out.println("Es un triángulo equilátero");
        } else if (lado1==lado2||lado1==lado3||lado2==lado3) {
            System.out.println("Es un triángulo isóceles");
            
        }
        sc.close();


    }
}
