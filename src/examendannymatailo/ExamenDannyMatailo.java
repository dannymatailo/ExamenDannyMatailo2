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
public class ExamenDannyMatailo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    DatosPersona dato1=new DatosPersona();
    dato1.setNombre("Juan");
    System.out.println("El Nombre es        = " +dato1.getNombre());
   
    dato1.setEdad(35);
    System.out.println("La edad   es        = " +dato1.getEdad());
   
    dato1.setPeso(90);
    System.out.println("El Peso   es        = " +dato1.getPeso());
    
    dato1.setAltura(1.80f);
    System.out.println("La altura es        = " +dato1.getAltura());
  
    System.out.println("La masa corporal  es        = " +dato1.MasaCorporal());
    System.out.println("Datos segunda persona");
    
    
    DatosPersona dato7=new DatosPersona();
    dato7.setNombre("Danny");
    System.out.println("El Nombre es        = " +dato7.getNombre());
    
    dato7.setEdad(19);
    System.out.println("La edad   es        = " +dato7.getEdad());
    
    dato7.setPeso(93);
    System.out.println("El Peso   es        = " +dato7.getPeso());
    
    dato7.setAltura(1.75f);
    System.out.println("La altura es        = " +dato7.getAltura());
    
    System.out.println("La masa corporal  es        = " +dato7.MasaCorporal());
    
    
    
    }
    
}
