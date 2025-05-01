import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner maiNu = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + " número: ");
            int num = maiNu.nextInt();
            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
