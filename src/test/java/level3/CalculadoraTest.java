package level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 4);
        assertEquals(16, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(4, 2);
        assertEquals(2, resultado);
    }

}








