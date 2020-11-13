
package examen1_jorgezuniga;

/**
 *
 * @author Alejandro
 */
public class Armas extends Personas{
    private String tipo;
    private int daño;

    public Armas(){
    super();
    }

    public Armas(String tipo, int daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Tipo=" + tipo + ", Daño=" + daño;
    }
    
    
}
