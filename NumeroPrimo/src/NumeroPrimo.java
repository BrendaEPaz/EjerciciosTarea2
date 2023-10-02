import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para verificar si es primo y menor que 100: ");
        int num = sc.nextInt();
        boolean primo = true;
        int i;

        if (num<100){
           if(num<=1){
               primo=false;
               System.out.println("El número "+num+" no es primo");
            }
           else {
               for (i = 2; i <num; i++){
                   if (num%i==0){
                       primo=false;
                       System.out.println("El número "+num+" no es primo");
                       break;
                   }
               }
               if (primo){
                   System.out.println("El número "+num+" es primo");
               }
           }
        }
        else {
            System.out.println("El número "+num+ " es mayor que 100");
        }
        sc.close();
    }
}
