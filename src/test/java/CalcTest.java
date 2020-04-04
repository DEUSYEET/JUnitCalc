import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();
    float x = 2.5f;
    float y = 3;

    @Test
    void add() {
        float expexted = 5.5f;
        float result = calc.Add(x,y);
        assertEquals(expexted,result);
    }

    @Test
    void subtract() {
        float expexted = -0.5f;
        float result = calc.Subtract(x,y);
        assertEquals(expexted,result);
    }

    @Test
    void multiply() {
        float expexted = 7.5f;
        float result = calc.Multiply(x,y);
        assertEquals(expexted,result);
    }

    @Test
    void divide() {
        x = 5;
        y = 2;
        float expexted = 2.5f;
        float result = calc.Divide(x,y);
        assertEquals(expexted,result);
    }
}