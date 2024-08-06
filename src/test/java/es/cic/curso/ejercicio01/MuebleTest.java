package es.cic.curso.ejercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MuebleTest {

    private Armario armario;
    private Cama cama;
    private Coche coche;

    @BeforeEach
    public void setUp() {
        armario = new Armario();
        cama = new Cama();
        coche = new Coche();
    }

    @Test
    public void testArmario() {
        assertFalse(armario.arePuertasAbiertas());
        armario.abrirPuertas();
        assertTrue(armario.arePuertasAbiertas());
        armario.cerrarPuertas();
        assertFalse(armario.arePuertasAbiertas());
    }

    @Test
    public void testCama() {
        assertEquals(0, cama.getAltura());
        cama.ajustarAltura(50);
        assertEquals(50, cama.getAltura());
    }

    @Test
    public void testCoche() {
        assertFalse(coche.isMotorEncendido());
        coche.arrancarMotor();
        assertTrue(coche.isMotorEncendido());
        coche.apagarMotor();
        assertFalse(coche.isMotorEncendido());
    }

    @Test
    public void testCompuerta() {
        armario.abrirCompuerta();
        assertTrue(armario.isCompuertaAbierta());
        armario.cerrarCompuerta();
        assertFalse(armario.isCompuertaAbierta());

        cama.abrirCompuerta();
        assertTrue(cama.isCompuertaAbierta());
        cama.cerrarCompuerta();
        assertFalse(cama.isCompuertaAbierta());

        coche.abrirCompuerta();
        assertTrue(coche.isCompuertaAbierta());
        coche.cerrarCompuerta();
        assertFalse(coche.isCompuertaAbierta());
    }
}