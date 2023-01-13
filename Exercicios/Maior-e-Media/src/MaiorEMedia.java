/* Faça um programa que leia 5 números e 
 * informe o maior número e a média desses números. 
 */
import java.util.Scanner; 

public class MaiorEMedia { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num, soma = 0, maior = 0; 

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt(); 
            if (num > maior) { 
                maior = num;
            }
            soma = num + soma; 
        }

        System.out.println("A média é " + soma / 5);
        System.out.println("O maior número é: " + maior); 

    

    }

}