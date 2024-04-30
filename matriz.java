import java.util.Scanner;
public class matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o tamanho da matriz quadrada:  ");
        int tamanhoMatriz = input.nextInt();

        int[][] matriz = new int [tamanhoMatriz][tamanhoMatriz];

        System.out.println("elementos de entrada na primeira matriz:  ");
        for(int linha = 0; linha < tamanhoMatriz; linha++){
            for(int coluna = 0; coluna < tamanhoMatriz; coluna++){
                System.out.printf("elemento - [%d], [%d]: ", linha+1, coluna+1);
                matriz[linha][coluna] = input.nextInt();
            }
        }

        for(int linha = 0; linha < tamanhoMatriz; linha++) {
        	for(int coluna = 0; coluna < tamanhoMatriz; coluna++) {
        		System.out.printf("\t %d \t", matriz[linha][coluna]);
        		
        	}
        	System.out.println("");
        	
        	 
        }
        input.close();

    }
}
