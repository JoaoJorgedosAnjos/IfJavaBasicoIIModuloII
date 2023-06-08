import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[]args){
        int nro_estudantes, soma, nota, notaslidas;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de estudantes da turma: ");

        nro_estudantes = scanner.nextInt();

        soma = 0;

        notaslidas = 0;

        while(notaslidas < nro_estudantes) {

            System.out.printf("Nota %d: ", notaslidas+1);

            nota = scanner.nextInt();

            soma = soma + nota;

            notaslidas = notaslidas + 1;

        }
        media = (double) soma / nro_estudantes;

        System.out.printf("Media das notas = %.1f\n", media);
    }

}


