package es.cic.curso.ejercicio01;

public class Cama extends Mueble {
    private int altura;

    public void ajustarAltura(int nuevaAltura) {
        altura = nuevaAltura;
        System.out.println("Altura de la cama ajustada a " + altura);
    }

    public int getAltura() {
        return altura;
    }
}