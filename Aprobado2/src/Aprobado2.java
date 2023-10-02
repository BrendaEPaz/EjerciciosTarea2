import java.util.Scanner;
public class Aprobado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre para saber si aprobaste o no.");
        String name = sc.nextLine().toLowerCase();

        String[] names = {"beatriz","armando","nicolas", "patricia"};
        int [] scores={100,68,99,35};
        boolean find=false;
        int i;

        for (i=0; i<names.length; i++){
            if(name.equals(names[i])){
                find=true;
                int score=scores[i];
                if (score>=70){
                    System.out.println("Aprobaste con "+score);
                }
                else {
                    System.out.println("No aprobaste con "+score);
                }
                break;
            }
        }
        if (!find){
            System.out.println("Tu nombre no está en la lista");
        }
        sc.close();
    }
}
