import java.util.Scanner;

public class ListaPrimos {

    public static void main(String[] args) {
        // Scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // Prompt para o usuario digitar o limite inicial
        System.out.print("Digite o limite inicial (maior que 0): ");
        int limiteInicial = scanner.nextInt();

        // Prompt para o usuario digitar o limite final
        System.out.print("Digite o limite final (maior que o limite inicial): ");
        int limiteFinal = scanner.nextInt();

        // Valida se o limite final e maior que o limite inicial
        if (limiteFinal <= limiteInicial) {
            System.out.println("Limite final deve ser maior que o limite inicial. Tente novamente.");
            return;
        }

        // Gera e exibe a lista de numeros primos
        System.out.println("Lista de numeros primos entre " + limiteInicial + " e " + limiteFinal + ":");
        for (int numero = limiteInicial; numero <= limiteFinal; numero++) {
            if (isPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
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

