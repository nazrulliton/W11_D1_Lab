import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(10.00, 25.00);
    }
    @Test
    public void hasNum1(){
        assertEquals(10.00, calculator.getNum1(), 0.01);
    }
    @Test
    public void hasNum2(){
        assertEquals(25.00, calculator.getNum2(), 0.01);
    }
    @Test
    public void addNums(){
        assertEquals(35.00, calculator.addNumbers(), 0.01);
    }
    @Test
    public void subNums(){
        assertEquals(15.00, calculator.subNumbers(), 0.01);
    }
    @Test
    public void multiNums(){
        assertEquals(250.00, calculator.multiNumbers(), 0.01);
    }
    @Test
    public void divNums(){
        assertEquals(2.50, calculator.divNumbers(), 0.01);
    }
}
