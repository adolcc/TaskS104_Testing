package level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.add(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testSubtract() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtract(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiply() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiply(4, 4);
        assertEquals(16, resultado);
    }

    @Test
    public void testDivide() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divide(4, 2);
        assertEquals(2, resultado);
    }

}








