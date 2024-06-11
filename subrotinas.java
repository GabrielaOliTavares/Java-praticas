import java.util.InputMismatchException;
import java.util.Scanner;

public class Subrotinas {

    public static int soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int subtracao(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicacao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Erro: Multiplicação por zero não é permitida.");
        }

        int resultado = 0;

        for (int i = 0; i < b; i++) {
            resultado = soma(resultado, a);
        }

        return resultado;
    }

    public static int potencia(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Erro: Potência negativa não é permitida.");
        }

        int resultado = 1;

        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.println("\nSelecione a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Potênciação");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        try {
            int resultado;

            switch (opcao) {
                case 1:
                    resultado = soma(a, b);
                    System.out.printf("%d + %d = %d\n", a, b, resultado);
                    break;
                case 2:
                    resultado = subtracao(a, b);
                    System.out.printf("%d - %d = %d\n", a, b, resultado);
                    break;
                case 3:
                    resultado = multiplicacao(a, b);
                    System.out.printf("%d * %d = %d\n", a, b, resultado);
                    break;
                case 4:
                    resultado = potencia(a, b);
                    System.out.printf("%d ^ %d = %d\n", a, b, resultado);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
