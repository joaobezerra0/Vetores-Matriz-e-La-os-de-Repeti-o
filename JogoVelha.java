import java.util.Scanner;

public class JogoVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        boolean turnoX = true;
        int jogadas = 0;

        while (jogadas < 9) {
            System.out.println("Tabuleiro atual:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " ");
                }
                System.out.println();
            }

            char simbolo = turnoX ? 'X' : 'O';
            System.out.print("Jogador " + simbolo + ", digite linha (0-2): ");
            int linha = scanner.nextInt();
            System.out.print("Digite coluna (0-2): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = simbolo;
                jogadas++;
                turnoX = !turnoX;
            } else {
                System.out.println("Posicao invalida! Tente novamente.");
            }
        }

        System.out.println("Tabuleiro final:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
