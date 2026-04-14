import java.util.Scanner;

public class exercicio5tg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l1, l2, l3;

        System.out.print("Digite um valor para o lado 1 do triângulo: ");
        l1 = sc.nextDouble();
        System.out.print("Digite um valor para o lado 2 do triângulo: ");
        l2 = sc.nextDouble();
        System.out.print("Digite um valor para o lado 3 do triângulo: ");
        l3 = sc.nextDouble();


        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 +l2) {
            System.out.println("Os valores formam um triângulo!");
        } else {
            System.out.println("Os valores não formam um triângulo!");
        }
    }
}
