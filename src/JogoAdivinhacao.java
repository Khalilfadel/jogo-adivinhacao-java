import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

            int numeroSecreto = random.nextInt(100) + 1;
            int tentativa;
            int tentativas = 0;

                System.out.println("🎮 Bem-vindo ao Jogo de Adivinhação!");
                System.out.println("Tente adivinhar o número entre 1 e 100.");

                do {
                    System.out.print("Digite sua tentativa: ");
                    tentativa = scanner.nextInt();
                    tentativas++;

                    if (tentativa < numeroSecreto) {
                        System.out.println("⬆ O número é maior...");
                    } else if (tentativa > numeroSecreto) {
                        System.out.println("⬇ O número é menor...");
                    } else {
                        System.out.println("Bingo, parabéns, você acertou!! " + tentativas + " tentativas.");
                    }

                        } while (tentativa != numeroSecreto);

                        scanner.close();
    }
}