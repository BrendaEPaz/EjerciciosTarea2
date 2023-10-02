import java.util.Scanner;
public class Vip18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int age=sc.nextInt();

        if (age>18){
            System.out.println("Bienvenido, tienes acceso a la sala VIP.");
        }
        else {
            sc = new Scanner(System.in);
            System.out.println("Tienes una invitación especial? Escribe 'si' o 'no': ");
            String invitation = sc.nextLine();

            if (invitation.equals("si")){
                System.out.println("Bienvenido, tienes acceso a la sala VIP.");
            }
            else {
                System.out.println("Lo sentimos, no tienes acceso. Necesitas ser mayor de edad o tener una invitación especial.");
            }
            sc.close();
        }
    }
}
