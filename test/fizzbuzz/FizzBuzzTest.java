package fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz;
    
    public FizzBuzzTest() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void MultiplesOfThree_ReturnFizz() {
        assertEquals("Fizz", fizzBuzz.calculate(3));
        assertEquals("Fizz", fizzBuzz.calculate(6));
        assertEquals("Fizz", fizzBuzz.calculate(9));
        assertEquals("Fizz", fizzBuzz.calculate(12));
    }

    @Test
    public void MultiplesOfFive_ReturnBuzz() {
        assertEquals("Buzz", fizzBuzz.calculate(5));
        assertEquals("Buzz", fizzBuzz.calculate(25));
        assertEquals("Buzz", fizzBuzz.calculate(50));
        assertEquals("Buzz", fizzBuzz.calculate(65));
    }
    
    @Test
    public void MultiplesOfThreeAndFive_ReturnFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
        assertEquals("FizzBuzz", fizzBuzz.calculate(30));
        assertEquals("FizzBuzz", fizzBuzz.calculate(45));
        assertEquals("FizzBuzz", fizzBuzz.calculate(90));
        assertEquals("FizzBuzz", fizzBuzz.calculate(75));
        assertEquals("FizzBuzz", fizzBuzz.calculate(60));
    }
    
    @Test
    public void NotMultiplesOfThreeOrFive_ReturnNumber() {
        assertEquals("1", fizzBuzz.calculate(1));
        assertEquals("2", fizzBuzz.calculate(2));
        assertEquals("11", fizzBuzz.calculate(11));
        assertEquals("56", fizzBuzz.calculate(56));
    }
   
    
}
