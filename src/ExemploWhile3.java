import java.util.Scanner;

public class ExemploWhile3 {
    public static void main(String[]args){
        int number, value,factorial;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o número: ");
        number = scanner.nextInt();

        value = 2;
        factorial = 1;

        while (value <= number){
            factorial = factorial * value;
            value = value + 1;
        }
        System.out.printf("O fatorial de %d é %d", number, factorial);
    }
}
