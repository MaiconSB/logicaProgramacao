/* Faça um programa que peça N números inteiros, 
 * claucule e mostre a quantidade de números pares 
 * e a quantidade de números ímpares. ]
 */
import java.util.Scanner; 

public class PareImpar {
    public static void main (String[] args) { 
        Scanner scan = new Scanner (System.in); 

        int num, par =0, impar = 0;

        System.out.println("Digite o numero de vezes: ");
        int n = scan.nextInt(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("(" + i +") Digite um número: ");
            num = scan.nextInt(); 
            if (num % 2 == 0) { 
                par++; 
            } else {
                impar++;
            }
        }

        System.out.println("A quantidade de números pares é: " + par); 
        System.out.println("A quantidade de números impares é: " + impar); 

    }
}
