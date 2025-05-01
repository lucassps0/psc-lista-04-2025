import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;

        do {
            System.out.print("População A: ");
            int popA = sc.nextInt();

            System.out.print("População B: ");
            int popB = sc.nextInt();

            System.out.print("Taxa crescimento A (%): ");
            double taxaA = sc.nextDouble();

            System.out.print("Taxa crescimento B (%): ");
            double taxaB = sc.nextDouble();

            if (popA > 0 && popB > 0 && taxaA > 0 && taxaB > 0) {
                int anos = 0;
                while (popA <= popB) {
                    popA += popA * taxaA / 100;
                    popB += popB * taxaB / 100;
                    anos++;
                }
                System.out.println("População A ultrapassará B em " + anos + " anos.");
            } else {
                System.out.println("Entradas inválidas.");
            }

            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().toLowerCase();
        } while (repetir.equals("s"));
    }
}
