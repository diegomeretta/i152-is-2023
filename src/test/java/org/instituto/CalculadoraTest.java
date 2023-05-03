package org.instituto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @DisplayName("Sumar 2 y 3")
    @Test
    void sumarDosYTres(){
        Integer resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
    
    @DisplayName("Sumar 4 y 1")
    @Test
    void sumarCuatroYUno(){
        Integer resultado = calculadora.sumar(4, 1);
        assertEquals(5, resultado);
    }
    
    @DisplayName("Sumar 3 y 1")
    @Test
    void sumarTresYUno(){
        Integer resultado = calculadora.sumar(3, 1);
        assertEquals(4, resultado);
    }
    
    @DisplayName("Multiplicar 9 y 8")
    @Test
    void multiplicarNueveYOcho(){
        Integer resultado = calculadora.multiplicar(9, 8);
        assertEquals(72, resultado);
    }
    
    @Test
    void diferenciaEntreNueveYCuatro(){
        Integer resultado = calculadora.diferencia(9, 4);
        assertEquals(5, resultado);
    }
    
    @Test
    void diferenciaEntreCuatroYNueve(){
        Integer resultado = calculadora.diferencia(4, 9);
        assertEquals(5, resultado);
    }
}
