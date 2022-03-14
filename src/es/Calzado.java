package es;

/**
 * Esta clase contiene los atributos y metodos de un calzado 
 * @author Marina
 */
public class Calzado {

    String tipo;    
    int talla;
    boolean cordones;
    
    /**
     * Método constructor por defecto de un calzado 
     */
    public Calzado() {
        this.tipo = "Zapatilla";
        this.talla = 38;
        this.cordones = true;
    }

    /** 
     * Método constructor para introducir los diferentes parámetros
     * @param tipo Atributo que indica el tipo de calzado 
     * @param talla Atributo que indica la talla del calzado
     * @param cordones Atributo que indica si lleva o no cordones
     */  
    public Calzado(String tipo, int talla, boolean cordones) {
        this.tipo = tipo;
        this.talla = talla;
        this.cordones = cordones;
    }
    
    /**
     * Método toString que devuelve los parámetros de un calzado en una cadena
     * @return Devuelve los valores de los atributos de un calzado (tipo , talla y cordones) en una cadena
     */
     @Override
    public String toString() {
        return "Calzado: " + "tipo= " + tipo + ", talla= " + talla + ", cordones=" + cordones ;
    }
    
    /**
     * Metodo para cambiar el tipo de calzado 
     * @param tipo nombre dek tipo de calzado
     */
    public void cambiaTipo(String tipo){
        this.tipo = tipo;
    }
    
    /**
     * Método que devuelve el tipo de calzado 
     * @return Devuelve el tipo de calzado 
     */
    public String consultaTipo(){
        return this.tipo;
    }
    
    /**
     * Método para cambiar la talla del calzado 
     * @param talla Para indicar la talla del clazado 
     */
    public void cambiaTalla(int talla){
        this.talla = talla;
    }
    
    /**
     * Método que devuelve la talla del calzado 
     * @return Devuelve la talla del calzado 
     */
    public int consultaTalla(){
        return this.talla;
    }
    
    /**
     * Método para indicar si lleva o no cordones el calzado 
     * @param cordones Para indicar si lleva o no cordeones el calzado 
     */
    public void cambiaCordones(boolean cordones){
        this.cordones = cordones;
    }
    
    /**
     * Método que te indica si el calzado lleva o no cordones
     * @return Para saber si un calzado lleva o no cordones
     */
    public boolean consultaCordones(){
        return this.cordones;
    }
          
    /**
     * Método para comparar dos calzados diferentes según su talla
     * @param a Nombre del primer calzado a comparar
     * @param b Nombre del segundo calzado a comparar
     */
    public void compararTalla(Calzado a, Calzado b){
        if (a.talla > b.talla){
            System.out.println("El calzado a es mayor que el calzado b");
        }else{
           if (a.talla < b.talla){
            System.out.println("El calzado a es menor que el calzado b"); 
           }else{
               System.out.println("La talla de los calzados son iguales");
           }
        }
    }
    
    /**
     * Método para comparar tallas 
     * @param talla1 Valor de la primera talla a comparar
     * @param talla2 Valor de la segunda talla a comparar
     */
    public void compararTalla(int talla1, int talla2){
        if (talla1 > talla2){
            System.out.println("La talla "+ talla1 + " es mayor que la talla "+ talla2);
        }else{
           if (talla1 < talla2){
            System.out.println("La talla "+ talla1 + " es menor que la talla "+ talla2); 
           }else{
               System.out.println("La talla de los calzados es la misma");
           }
        }
    }

}