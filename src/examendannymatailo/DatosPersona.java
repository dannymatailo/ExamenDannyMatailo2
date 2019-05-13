/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendannymatailo;

/**
 *
 * @author labctr
 */
public class DatosPersona {
    String Nombre;
    int Edad;
    float Peso;
    float Altura;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
        public DatosPersona() {
    }

    public DatosPersona(String Nombre, int Edad, float Peso, float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Altura = Altura;
        
    }
    public float MasaCorporal(){
        return (Peso/(Altura*Altura));
    }
    
}
