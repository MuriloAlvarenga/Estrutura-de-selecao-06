import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double slrbruto, aliquota;
        double imposto, slrliquido;

        System.out.print("Digite seu salário bruto: ");
        slrbruto = sc.nextDouble();

        if (slrbruto <= 2112) {
            aliquota = 0;
        } else if (slrbruto <= 2826.65) {
            aliquota = 7.5;
        } else if (slrbruto <= 3751.05) {
            aliquota = 15;
        } else if (slrbruto <= 4664.68) {
            aliquota = 22.5;
        } else {
            aliquota = 27.5;
        }

        imposto = slrbruto * aliquota / 100;
        slrliquido = slrbruto - imposto;

        // para deixar o número com 2 casas decimais é necessário String.format("%2f")

        System.out.println("Salário bruto R$" + String.format("%.2f", slrbruto));
        // para deixar o comando calcular como porcentagem % é necessário String.format ("%2.f%%)
        System.out.println("Alíquota " + String.format("%.2f%%", aliquota));
        System.out.println("Imposto R$ " + String.format("%.2f", imposto));
        System.out.println("Salário líquido " + String.format("%.2f", slrliquido));

    }
}
