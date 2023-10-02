import java.util.Scanner;
public class CadenaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra para determinar si contiene las letras 'a' o 'b': ");
        String cadena = sc.next();

        if (cadena.contains("a") && cadena.contains("b")){
            System.out.println("La palabra "+cadena+" contiene las dos letras: 'a' y 'b'");
        }
        else{
            System.out.println("La palabra "+cadena+" NO contiene las dos letras: 'a' y 'b'");
        }
        sc.close();


    }
}
