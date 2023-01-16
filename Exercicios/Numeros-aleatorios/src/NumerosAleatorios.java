/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100), armazene-
 * -os em um vetor. Ao final mostre os números e seus sucessores.
 */
import java.util.Random; 

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        int[] numerosAleatorios = new int [20]; 

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int num = random.nextInt( 100); 
            numerosAleatorios[i] = num;
        }

        System.out.print("Números aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print(num + " "); 
            
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print((num+1 )+ " "); 
            
        }

        System.out.print("\nAntecessores do números aleatórios: ");
        for (int num : numerosAleatorios) {
            System.out.print((num-1 )+ " "); 
            
        }
    }
}
