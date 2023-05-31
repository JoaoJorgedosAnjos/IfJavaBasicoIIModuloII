import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, result;

        System.out.printf("Digite o valor de A: ");
        a = scanner.nextByte();
        System.out.printf("Digite o valor de B: ");
        b = scanner.nextByte();
        System.out.printf("Digite o valor de C: ");
        c = scanner.nextByte();

        result = (b * b) - 4 * (a * c);

        if (result < 0) {
            System.out.printf("A equação não possui raízes reais");
        } else if (result > 0) {
            System.out.printf("A equação possui duas raízes reais,");
        } else {
            System.out.printf("A equação possui uma única raízes reais,");
        }
    }
}