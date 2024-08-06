package es.cic.curso.ejercicio01;

public abstract class Mueble implements Compuerta {
    protected boolean compuertaAbierta;

    @Override
    public void abrirCompuerta() {
        compuertaAbierta = true;
        System.out.println("Compuerta abierta");
    }

    @Override
    public void cerrarCompuerta() {
        compuertaAbierta = false;
        System.out.println("Compuerta cerrada");
    }

    @Override
    public boolean isCompuertaAbierta() {
        return compuertaAbierta;
    }
}