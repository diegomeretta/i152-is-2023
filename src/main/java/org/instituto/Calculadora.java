package org.instituto;

public class Calculadora {

    public Integer sumar(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }
    
    public Integer multiplicar(Integer numero1, Integer numero2) {
    	Integer resultado = 0;
    	for (int i = 0; i < numero1; i++) {
			resultado += numero2; 
		}
    	return resultado;
    }
    
    public Integer diferencia(Integer numero1, Integer numero2){
    	Integer resultado = 0;
    	if (numero1 < numero2) {
    		resultado = numero2 - numero1;
    	} else {
    		resultado = numero1 - numero2;
    	}
    		
    	return resultado;
    }
}
