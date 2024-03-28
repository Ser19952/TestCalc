package test.java.org.example;

import org.example.Calculator;
import org.junit.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 4);
        Assert.assertEquals(6, result);


    }
    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 5);
        Assert.assertEquals(5, result);
    }
    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        int result = calc.mul(20, 30) ;
        Assert.assertEquals(600, result);
      
    }
    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        int result = calc.div(10,5) ;
        Assert.assertEquals(2, result);
    }
}

