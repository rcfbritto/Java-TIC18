import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira a temperatura e a unidade de origem
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

        // Realizar a conversão com base na escolha do usuário
        double resultado;
        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("A temperatura em Fahrenheit é: " + resultado + " °F");
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("A temperatura em Celsius é: " + resultado + " °C");
        } else {
            System.out.println("Opção de unidade inválida.");
        }

        // Fechar o Scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Método para converter de Celsius para Fahrenheit
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter de Fahrenheit para Celsius
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
