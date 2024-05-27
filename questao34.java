import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Prompt para o usuário digitar o número
        System.out.print("Digite um número inteiro: ");

        // Armazena o número digitado
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean isPrimo = isPrimo(numero);

        // Exibe o resultado
        System.out.println(numero + (isPrimo ? " é um número primo" : " não é um número primo"));
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
