import java.util.Scanner;

public class exercicioverificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, senha;

        System.out.print("Digite o nome do Usuário: ");
        usuario = sc.next();

        System.out.print("Digite a senha: ");
        senha = sc.next();

        if (usuario.equals("admin") && senha.equals("fiap2026")) {
            System.out.println("Acesso liberado");

        } else if (usuario.equals("admin")) {
            System.out.println("Senha errada");

        } else {
            System.out.println("Usuário não encontrado");
        }
    }
}
