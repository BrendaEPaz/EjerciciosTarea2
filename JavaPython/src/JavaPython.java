//verificar si una cadena contiene la palabra 'Java' y no contiene 'Python
import java.util.Scanner;
public class JavaPython {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto para verificar si tiene la palabra 'Java' y no contiene 'Python");
        String string = sc.nextLine().toLowerCase();

        if (string.contains("java") && string.contains("python")) {
            System.out.println("La cadena contiene 'Java' y contiene 'Python'.");
        } else if (!string.contains("java")&& !string.contains("python")) {
            System.out.println("La cadena no contiene 'Java', ni 'Python'.");
        } else if (!string.contains("java") && string.contains("python")) {
            System.out.println("La cadena no contiene 'Java' y contiene 'Python'.");
        } else {
            System.out.println("La cadena contiene 'Java' y no contiene'Python'");
        }
        sc.close();
    }
}
