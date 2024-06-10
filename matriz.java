import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        double[] notas = new double[10];
        double somaNotas = 0;
        double media = 0;
        int alunosAcimaMedia = 0;
        int alunosAbaixoMedia = 0;

        // Leitura das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        // Cálculo da média
        media = somaNotas / notas.length;

        // Listagem de alunos com notas abaixo da média
        System.out.println("\nAlunos com notas abaixo da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                alunosAbaixoMedia++;
            }
        }

        // Verificação se há alunos com notas acima da média
        if (alunosAcimaMedia == 0) {
            System.out.println("\nNão há alunos com notas acima da média.");
        } else {
            // Listagem de alunos com notas acima ou iguais à média
            System.out.println("\nAlunos com notas acima ou iguais à média:");
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= media) {
                    System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                    alunosAcimaMedia++;
                }
            }
        }

        // Impressão da média
        System.out.println("\nMédia das notas: " + media);
    }
}
Use o código com cuidado.
content_copy
Explicação do código:

Importação da biblioteca Scanner: A biblioteca Scanner é utilizada para ler a entrada do usuário.
Declaração de variáveis:
notas: Array para armazenar as notas dos 10 alunos.
somaNotas: Variável para armazenar a soma das notas.
media: Variável para armazenar a média das notas.
alunosAcimaMedia: Variável para contar o número de alunos com notas acima da média.
alunosAbaixoMedia: Variável para contar o número de alunos com notas abaixo da média.
Leitura das notas:
Um loop for é utilizado para ler as notas de cada aluno.
O usuário é solicitado a digitar a nota de cada aluno.
A nota é armazenada no array notas.
A soma das notas é armazenada na variável somaNotas.
Cálculo da média:
A média é calculada dividindo a soma das notas pelo número de alunos.
Listagem de alunos com notas abaixo da média:
Um loop for é utilizado para percorrer o array notas.
Se a nota de um aluno for menor que a média, o aluno e sua nota são impressos.
O número de alunos com notas abaixo da média é incrementado.
Verificação se há alunos com notas acima da média:
Se o número de alunos com notas acima da média for zero, significa que todos os alunos têm notas abaixo da média.
Nesse caso, uma mensagem informando isso é impressa.
Listagem de alunos com notas acima ou iguais à média:
Se houver pelo menos um aluno com nota acima da média, um loop for é utilizado para percorrer o array notas.
Se a nota de um aluno for maior ou igual à média, o aluno e sua nota são impressos.
O número de alunos com notas acima da média é incrementado.
Impressão da média:
O valor da média é impresso.
Observações:

Este programa assume que o usuário digitará notas válidas (números entre 0 e 10).
Você pode modificar o programa para lidar com casos de erro, como entrada invá
Fontes
info
github.com/KanamyStewart/POOEMJAVA



share


more_vert

1. Escreva um programa em Java para encontrar a soma das diagonais
direita de uma matriz.
a. Exemplo:

21

Insira o tamanho da matriz quadrada: 2
elementos de entrada na primeira matriz:
elemento - [0],[0]: 4
elemento - [0],[1]: 2
elemento - [1],[0]: 8
elemento - [1],[1]: 12
A matriz é:
4 2
8 12
A adição dos elementos diagonais esquerdos é: 16
expand_moreedit
Mostrar rascunhos
volume_up

Programa Java para calcular a soma da diagonal principal de uma matriz quadrada
Java
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
