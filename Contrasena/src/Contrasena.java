import java.util.Scanner;
public class Contrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario: ");
        String user = sc.next();
        System.out.println("Ingresa tu contraseña: ");
        String password=sc.next();

        String correctPassword= "MujerDigital2023";
        String correctUsername= "Brenda";

        if ((user.equals(correctUsername))&&(password.equals(correctPassword))){
            System.out.println("Iniciaste sesión");
        }
        else {
            System.out.println("El usuario y/o contraseña son incorrectos.");
            }
        }

    }
