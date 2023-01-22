public class App {

    public static void main (String[] args) {
     
    //usando o construtor padrão, sem parâmetros   
    Carro carro1 = new Carro(); 
    
    carro1.setCor("Azul");
    carro1.setModelo("BMW Série 3");
    carro1.setCapacidadeTanque(59); 

    System.out.println(carro1.getModelo()); 
    System.out.println(carro1.getCor());
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.totalValorTanque(6.39));

    //usando o construtor com parâmetros 
    Carro carro2 = new Carro("Cinza", "Mercedes-Bens Classe C", 66); 

    System.out.println(carro2.getModelo()); 
    System.out.println(carro2.getCor());
    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(carro2.totalValorTanque(6.46));
    }
    
}
