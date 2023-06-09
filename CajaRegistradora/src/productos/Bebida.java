package productos;

/**
 * @author David Elias González García
 * PROTECO, Gen 44 :)
 */
public class Bebida extends Productos {
    String sabor;
    int volumen;
    
    // Constructor
    public Bebida(float precio, String nom, int cod, String sab, int vol) {
        super(precio, nom, cod);
        this.sabor = sab;
        this.volumen = vol;
    }
    
    // Métodos
    @Override
    public String what(){
        String a = "Bebida "+this.nombre+" de sabor "+this.sabor+", con "+this.volumen+"ml, a $"+this.precio;
        return a;
    }
}
