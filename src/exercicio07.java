import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Digite uma temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        if (celsius <= 19) {
            System.out.println("A temperatura está fria");
        } else {
            System.out.println("A temperatura está quente");
        }
    }
}
