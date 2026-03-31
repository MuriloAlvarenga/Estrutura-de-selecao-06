import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2;
        double media;

        System.out.print("Digite sua primeira nota: ");
        v1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        v2 = sc.nextDouble();

        media = (v1 + v2) / 2;
        System.out.println("Sua média é: " + media);
        if (media >=6.0){
            System.out.println("Aprovado");
            } else {
            System.out.println("Reprovado");
        }
    }
}