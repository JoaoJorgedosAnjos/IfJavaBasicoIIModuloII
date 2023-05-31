import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        int number;

        System.out.printf("Digite um número inteiro: ");
        number = scanner.nextInt();
        if (number >= 1 && number >= 9){
            System.out.printf("O valor está na faixa permitida");
        }else {
            System.out.printf("O valor está fora da faixa permitida");
        }
    }
}
