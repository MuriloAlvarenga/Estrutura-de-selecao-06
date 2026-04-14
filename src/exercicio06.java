import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.print("Digite um ano e descubra se ele é bissexto ou não: ");
        ano = sc.nextInt();

        if ((ano % 4 <= 0 && ano % 100 !=0) || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é um ano bissexto!");
        }
        else {
            System.out.println("O ano " + ano + " não é um ano bissexto!");
        }
    }
}
