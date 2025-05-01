import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner vld = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        while (true) {
            System.out.print("Nome: ");
            nome = vld.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome deve ter mais de 3 caracteres.");
                continue;
            }

            System.out.print("Idade: ");
            idade = vld.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida.");
                continue;
            }

            System.out.print("Salário: ");
            salario = vld.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário inválido.");
                continue;
            }

            vld.nextLine();

            System.out.print("Sexo (f/m): ");
            sexo = vld.nextLine().toLowerCase();
            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Sexo inválido.");
                continue;
            }

            System.out.print("Estado Civil (s/c/v/d): ");
            estadoCivil = vld.nextLine().toLowerCase();
            if (!estadoCivil.matches("[scvd]")) {
                System.out.println("Estado civil inválido.");
                continue;
            }

            break;
        }

        System.out.println("Informações válidas!");
    }
}
