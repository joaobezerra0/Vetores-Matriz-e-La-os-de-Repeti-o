public class TranspostaMatriz {
    public static void main(String[] args) {
        int[][] original = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] transposta = new int[2][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposta[j][i] = original[i][j];
            }
        }

        System.out.println("Matriz original 3x2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
