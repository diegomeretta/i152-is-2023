package org.instituto;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Integer resultado = calculadora.sumar(3, 2);
        System.out.println("Resultado de sumar 3 y 2:" + resultado);
    }
}