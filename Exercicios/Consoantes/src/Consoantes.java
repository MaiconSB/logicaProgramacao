/* Faça um programa que leia um vetor de seis caracteres, e 
 * diga quantas consoantes foram lidas. Imprima as consoantes. 
 */
import java.util.Scanner; 

public class Consoantes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 

        String[] letras = new String[6]; 
        int quantidadeConsoantes = 0; 

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Letra: ");
            String letra = scan.next(); 
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || 
            letra.equals("u")) {

            } else {
                quantidadeConsoantes = quantidadeConsoantes + 1;
            }
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

    }
}
