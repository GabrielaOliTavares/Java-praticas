import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Prompt para o usuário digitar o número
        System.out.print("Digite um número inteiro: ");

        // Armazena o número digitado
        int numero = scanner.nextInt();

        // Calcula e exibe o fatorial
        String fatorialChain = calcularFatorialChain(numero);
        System.out.println(fatorialChain + " = " + obterFatorial(numero));
    }

    private static String calcularFatorialChain(int numero) {
        if (numero == 0) {
            return "1";
        } else {
            return numero + " * " + calcularFatorialChain(numero - 1);
        }
    }

    private static int obterFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * obterFatorial(numero - 1);
        }
    }
}
