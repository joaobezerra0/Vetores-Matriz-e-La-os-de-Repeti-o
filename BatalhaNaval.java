import java.util.Scanner;
import java.util.Random;

public class BatalhaNaval {
    public static void main(String[] args) {
        char[][] mar = new char[7][7];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = '.';
            }
        }

        int navios = 3;
        int acertos = 0;
        while (navios > 0) {
            int linha = random.nextInt(7);
            int coluna = random.nextInt(7);
            if (mar[linha][coluna] == '.') {
                mar[linha][coluna] = 'S';
                navios--;
            }
        }

        while (acertos < 3) {
            System.out.print("Digite linha (0-6): ");
            int linha = scanner.nextInt();
            System.out.print("Digite coluna (0-6): ");
            int coluna = scanner.nextInt();

            if (linha >= 0 && linha < 7 && coluna >= 0 && coluna < 7) {
                if (mar[linha][coluna] == 'S') {
                    System.out.println("Acertou um navio!");
                    mar[linha][coluna] = 'X';
                    acertos++;
                } else {
                    System.out.println("Agua! Tente novamente.");
                }
            } else {
                System.out.println("Posicao invalida!");
            }
        }

        System.out.println("Parabens! Voce destruiu todos os navios!");
        scanner.close();
    }
}
