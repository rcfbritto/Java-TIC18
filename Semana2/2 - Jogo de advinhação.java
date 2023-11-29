import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerar número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número (entre 1 e 100)");

        int tentativas = 0;
        int tentativaUsuario;

        do {
            // Pedir ao usuário que faça uma tentativa
            System.out.print("Sua tentativa: ");
            tentativaUsuario = scanner.nextInt();
            tentativas++;

            // Verificar se a tentativa está correta
            if (tentativaUsuario == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            } else if (tentativaUsuario < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Muito alto. Tente novamente.");
            }
        } while (tentativaUsuario != numeroSecreto);
    }
}
