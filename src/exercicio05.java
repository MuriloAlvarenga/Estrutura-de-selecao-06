import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valort, valorf, desconto;

        System.out.print("Qual foi o valor total das compras: ");
        valort = sc.nextDouble();


        if (valort > 1000) {
            desconto = valort * 15 / 100;
        } else {
            desconto = valort * 8 / 100;
            valorf = valort - desconto;

            System.out.println("O valor final é: " + valorf);
            System.out.println("O desconto é: " + desconto);
        }
    }
}