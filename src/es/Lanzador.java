package es;

/**
 * Clase que será el lanzador del programa 
 * @author Marina
 */
public class Lanzador {

    /** Clase main que muestra los datos de un calzado, y luego compara su talla con otro calzado y con otra talla
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calzado c1= new Calzado("BOTA", 38, false);
        Calzado c2= new Calzado("ZAPATILLA",40,true);
        
        System.out.println("Muestro el toString de Calzado"+c1.toString());
        
        c1.compararTalla(c1, c2);
        c1.compararTalla(38, 40);
        
    }
    
}
