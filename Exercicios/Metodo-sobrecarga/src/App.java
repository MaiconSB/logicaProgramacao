public class App {
    public static void main(String[] args) {
        System.out.println("Exercicio quadrilátero: ");
           double areaQuadrado = Quadrilatero.area(3);
           System.out.println("Área do quadrado: " + areaQuadrado);

           double areaRetangulo = Quadrilatero.area(5,5);
           System.out.println("Área do quadrado: " + areaRetangulo);

           double areaTrapezio = Quadrilatero.area(7,8,9);
           System.out.println("Área do quadrado: " + areaTrapezio);

           double areaDiagonal = Quadrilatero.area(5f,5f);
           System.out.println("Área do quadrado: " + areaDiagonal);
            
        
    }
}
