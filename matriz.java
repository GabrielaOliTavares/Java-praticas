import java.util.Scanner;

public class SomaDiagonalPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int tamanhoMatriz;
        int[][] matriz;
        int somaDiagonalPrincipal = 0;

        // Leitura do tamanho da matriz
        System.out.print("Insira o tamanho da matriz quadrada: ");
        tamanhoMatriz = scanner.nextInt();

        // Criação da matriz
        matriz = new int[tamanhoMatriz][tamanhoMatriz];

        // Leitura dos elementos da matriz
        System.out.println("\nInsira os elementos da matriz:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print("Elemento - [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impressão da matriz
        System.out.println("\nA matriz é:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Cálculo da soma da diagonal principal
        for (int i = 0; i < tamanhoMatriz; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Impressão da soma da diagonal principal
        System.out.println("\nA soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);
    }
}

