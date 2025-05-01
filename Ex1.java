import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner lT = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = lT.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida!");
    }
}
