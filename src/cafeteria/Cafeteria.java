
package cafeteria;


public class Cafeteria {

    
    public static void main(String[] args) {
        Cafe capuccino = new Capuccino();
        Cafe latte = new Latte();
        Cafe mocha = new Mocha();
        
        
        System.out.println("costo del capuccino es" );
        System.out.println( capuccino.calcularCostoTotal());
         
        System.out.println("costo del latte es" );
        System.out.println( latte.calcularCostoTotal());
        
        
        System.out.println("costo del mocha es" );
        System.out.println( mocha.calcularCostoTotal());
        
        
        
        
    }
    
}
