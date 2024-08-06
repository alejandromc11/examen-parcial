package es.cic.curso.ejercicio01;


public abstract class Mueble {
    private boolean compuertaAbierta;

    public void abrirCompuerta() {
        compuertaAbierta = true;
        System.out.println("Compuerta abierta");
    }

    public void cerrarCompuerta() {
        compuertaAbierta = false;
        System.out.println("Compuerta cerrada");
    }

    public boolean isCompuertaAbierta() {
        return compuertaAbierta;
    }

    public class Armario extends Mueble {
        
    }

    public class Cama extends Mueble {
        
    }

    public class Coche extends Mueble {
        
    }
}