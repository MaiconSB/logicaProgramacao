/* Faça um programa que clacule o fatorial de um número 
 * inteiro fornecido pelo usuário. 
 * Ex.: 5! =  120 (5x4x3x2x1)
 */
import java.util.Scanner; 

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 

        int fatorial, multiplicacao = 1; 

        System.out.println("Digite um numero para saber sua fatorial: ");
        fatorial = scan.nextInt();


        for (int i = fatorial; i >= 1; i--) { 
             
            multiplicacao = multiplicacao * i;
        }

        System.out.println("O fatorial do número (" + fatorial + ") é: " + multiplicacao);

    }
}
