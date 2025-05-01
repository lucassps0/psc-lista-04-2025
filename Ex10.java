import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entNuI = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = entNuI.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entNuI.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        for (int i = n1 + 1; i < n2; i++) {
            System.out.println(i);
        }
    }
}
