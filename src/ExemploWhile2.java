import java.util.Scanner;

public class ExemploWhile2 {
    public static void main(String[] args) {

        int notaslidas, soma, nota;

        double media;

        Scanner scanner = new Scanner(System.in);

        soma = 0;

        notaslidas = 0;

        System.out.printf("Nota 1: ");

        nota = scanner.nextInt();

        while(nota >= 0) {

            soma = soma + nota;

            notaslidas = notaslidas + 1;

            System.out.printf("Nota %d: ", notaslidas+1);

            nota = scanner.nextInt();

        }

        media = (double) soma / notaslidas;

        System.out.printf("Media das notas = %.1f\n", media);

    }
}
