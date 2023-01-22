import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;
         
        
        System.out.print("Digite quantos meses você quer juntar: "); 
        int entrada = leitor.nextInt(); 
        int total = mesada * entrada; 
        
        System.out.println("Você terá " + total + " reais.");
    }
}
