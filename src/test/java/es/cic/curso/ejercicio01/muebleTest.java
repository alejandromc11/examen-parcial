package es.cic.curso.ejercicio01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import es.cic.curso.ejercicio01.Mueble.Armario;
import es.cic.curso.ejercicio01.Mueble.Cama;
import es.cic.curso.ejercicio01.Mueble.Coche;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MuebleTests {

    @Autowired
    private Armario armario;

    @Autowired
    private Cama cama;

    @Autowired
    private Coche coche;

    @Test
    void testArmarioCompuerta() {
        armario.abrirCompuerta();
        assertTrue(armario.isCompuertaAbierta());
        armario.cerrarCompuerta();
        assertFalse(armario.isCompuertaAbierta());
    }

    @Test
    void testCamaCompuerta() {
        cama.abrirCompuerta();
        assertTrue(cama.isCompuertaAbierta());
        cama.cerrarCompuerta();
        assertFalse(cama.isCompuertaAbierta());
    }

    @Test
    void testCocheCompuerta() {
        coche.abrirCompuerta();
        assertTrue(coche.isCompuertaAbierta());
        coche.cerrarCompuerta();
        assertFalse(coche.isCompuertaAbierta());
    }
}