package es.cic.curso.ejercicio01;

public class Coche extends Mueble {
    private boolean motorEncendido;

    public void arrancarMotor() {
        motorEncendido = true;
        System.out.println("Motor del coche arrancado");
    }

    public void apagarMotor() {
        motorEncendido = false;
        System.out.println("Motor del coche apagado");
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }
}