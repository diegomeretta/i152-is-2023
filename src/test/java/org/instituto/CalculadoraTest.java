package org.instituto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void sumarDosYTres(){
        Integer resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
}
