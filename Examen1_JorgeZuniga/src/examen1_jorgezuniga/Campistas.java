
package examen1_jorgezuniga;

/**
 *
 * @author Alejandro
 */
public class Campistas extends Personas{
    private String tipo;
    private String estaraVivo;

    public Campistas() {
        super();
    }

    public Campistas(String tipo, String estaraVivo) {
        this.tipo = tipo;
        this.estaraVivo = estaraVivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstaraVivo() {
        return estaraVivo;
    }

    public void setEstaraVivo(String estaraVivo) {
        this.estaraVivo = estaraVivo;
    }

    @Override
    public String toString() {
        return "tipo=" + tipo + ", estaraVivo=" + estaraVivo ;
    }
    
}
