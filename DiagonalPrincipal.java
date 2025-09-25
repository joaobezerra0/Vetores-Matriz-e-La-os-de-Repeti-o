import java.util.Random;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}
