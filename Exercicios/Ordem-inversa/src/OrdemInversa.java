/*Crie um vetor de seis números inteiros e 
 * mostro-os na oredem inversa. 
 */
import java.util.Scanner; 

public class OrdemInversa {
    public static void main(String[] args) {
            
        int[] vector = {-5, -6, 15, 30, 8, 4};

        int count = 0;
        while (count < (vector.length)) { 
            System.out.println(vector[count]);
            count++; 

        }

        System.out.println (" "); 

        for(int i = vector.length-1; i >= 0; i--) {
            System.out.println(vector[i] + " " );

        }


    }
}

