package es.cic.curso.ejercicio01;

public class Armario extends Mueble {
    private boolean puertasAbiertas;

    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Puertas del armario abiertas");
    }

    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Puertas del armario cerradas");
    }

    public boolean arePuertasAbiertas() {
        return puertasAbiertas;
    }
}