/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada 
de qualquer número inteiro entre 1 a 10. O usuário deve informar 
de qual número ele ddeseja ver a tabuada. a saída deve ser conforme 
o exemplo abaixo: 

Tabuada de 5: 
5x1 = 5
5x2 = 10 
...
*/

import java.util.Scanner; 

public class Tabuada {
    public static void main (String [] arg) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Digite um número que queira digitar: "); 
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            int total = num * i; 
            System.out.println(num + " X " + i + " = " + total);

        }   
     }


}