import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        System.out.print("Numeros pares: ");
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Numeros impares: ");
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
