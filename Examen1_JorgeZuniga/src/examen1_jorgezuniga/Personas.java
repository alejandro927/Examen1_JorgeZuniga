
package examen1_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Personas {
    private String nombre,Tipo;
    private String sexo;
    private int edad;
    ArrayList <Armas> arma = new ArrayList();
    public Personas() {
    }

    public Personas(String nombre, String Tipo, String sexo, int edad,ArrayList arma) {
        this.nombre = nombre;
        this.Tipo = Tipo;
        this.sexo = sexo;
        this.edad = edad;
        this.arma = arma;
    }



    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public ArrayList<Armas> getArma() {
        return arma;
    }

    public void setArma(ArrayList<Armas> arma) {
        this.arma = arma;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", Tipo=" + Tipo + ", sexo=" + sexo + ", edad=" + edad + ", arma=" + arma;
    }

    
}
