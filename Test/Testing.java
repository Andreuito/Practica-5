package Practica5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {
    @Test
    void testSuma(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.suma(3,9);
        assertEquals(12, x, 0);
    }

    @Test
    void testResta(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.resta(9,3);
        assertEquals(6, x, 0);
    }

    @Test
    void testDivision(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.division(9,3);
        assertEquals(3, x,0);
    }

    @Test
    void testMultiplicacion(){
        Calculadora calculadora = new Calculadora();
        float x = calculadora.multiplicacion(9,3);
        assertEquals(27,x,0);
    }
}

