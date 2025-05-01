import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner soMe = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += soMe.nextDouble();
        }

        double media = soma / 5;
        System.out.println("Soma: " + soma + ", Média: " + media);
    }
}
