package programas;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resposta, fatorial;

        System.out.print("Calcule o fatorial de 1 até :");
        resposta = input.nextInt();

        for(int i = 1; i <= resposta; i++){
            fatorial = 1;
            System.out.print("Fatorial de " + i + " é ");
            for (int j = i; j >= 1; j--){
                fatorial *= j;
                if (j == 1){
                    System.out.print(j + " = ");
                }else {
                    System.out.print(j + " x " );
                }
            }

            System.out.println(fatorial);
            System.out.println("");
        }
    }
}
