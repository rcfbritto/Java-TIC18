import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira dois números
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar ao usuário que escolha uma operação
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação desejada: ");

        int escolha = scanner.nextInt();

        // Calcular e exibir o resultado com base na escolha do usuário
        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                // Verificar se o divisor (numero2) é diferente de zero
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
