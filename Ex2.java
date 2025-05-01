import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitorSenha = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Usuário: ");
            usuario = leitorSenha.nextLine();

            System.out.print("Senha: ");
            senha = leitorSenha.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            }
        } while (usuario.equals(senha));

        System.out.println("Cadastro realizado com sucesso!");
    }
}
