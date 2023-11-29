import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    public static int[] criarArrayUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array separados por espaço:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Números aleatórios até 100, ajuste conforme necessário
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    public static int encontrarMenorValor(int[] array) {
        return Arrays.stream(array).min().orElse(0);
    }

    public static void main(String[] args) {
        // Criar array do usuário
        int[] arrayUsuario = criarArrayUsuario();
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));

        // Criar array aleatório
        System.out.print("Digite o tamanho do array aleatório: ");
        Scanner scanner = new Scanner(System.in);
        int tamanhoArrayAleatorio = scanner.nextInt();
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoArrayAleatorio);
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        // Calcular soma
        int soma = calcularSoma(arrayUsuario);
        System.out.println("Soma do array do usuário: " + soma);

        // Encontrar maior valor
        int maiorValor = encontrarMaiorValor(arrayUsuario);
        System.out.println("Maior valor do array do usuário: " + maiorValor);

        // Encontrar menor valor
        int menorValor = encontrarMenorValor(arrayUsuario);
        System.out.println("Menor valor do array do usuário: " + menorValor);
    }
}
