import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que insira a taxa de câmbio
        System.out.print("Digite a taxa de câmbio (por exemplo, 5.35 para converter dólares para euros): ");
        double taxaCambio = scanner.nextDouble();

        // Pedir ao usuário que insira a quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double dolares = scanner.nextDouble();

        // Calcular o valor convertido
        double valorConvertido = dolares * taxaCambio;

        // Exibir o valor convertido
        System.out.println("Valor convertido: " + valorConvertido);
    }
}
