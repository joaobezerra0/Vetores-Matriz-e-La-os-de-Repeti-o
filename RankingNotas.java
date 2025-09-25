import java.util.Scanner;

public class RankingNotas {
    public static void main(String[] args) {
        double[][] notas = new double[5][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Medias dos alunos:");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2.0;
            System.out.println("Aluno " + (i + 1) + ": " + media);
        }

        scanner.close();
    }
}
