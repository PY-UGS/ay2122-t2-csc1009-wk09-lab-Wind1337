import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRandomCharacter {

    private static RandomCharacter randomCharacter;

    @BeforeAll
    public static void setup(){
        randomCharacter = new RandomCharacter(15);
    }

    @Test
    @DisplayName("Test generating lower case character")
    public void testLowerCaseCharacter(){
        System.out.println("Generating lower case character");
        String s = randomCharacter.getLowerCaseCharacter();
        System.out.println("Generated character: " + s);
        assertSame(s.toLowerCase(), s);
    }

    @Test
    @DisplayName("Test generating upper case character")
    public void testUpperCaseCharacter(){
        System.out.println("Generating upper case character");
        String s = randomCharacter.getUpperCaseCharacter();
        System.out.println("Generated character: " + s);
        assertSame(s.toUpperCase(), s);
    }

    @Test
    @DisplayName("Test generating single digit")
    public void testSingleDigit(){
        System.out.println("Generating single digit");
        int i = Integer.parseInt(randomCharacter.getRandomDigitCharacter());
        System.out.println("Generated character: " + i);
        assertTrue(i < 10);
        assertTrue(i >= 0);
    }

    @Test
    @DisplayName("Test generating single random character")
    public void testGetRandomCharacter(){
        System.out.println("Generating single random character");
        String s = randomCharacter.getRandomCharacter();
        System.out.println("Generated character: " + s);
        assertEquals(1, s.length());
    }

    @Test
    @DisplayName("Test if prime number generated")
    public void testIfPrimeNumber(){
        System.out.println("Generating random number and checking if it is prime");
        int i = Integer.parseInt(randomCharacter.getRandomDigitCharacter());
        System.out.println("Generated character: " + i);
        boolean flag = true;
        if (i <= 1) {
            flag = false;
        }
        else {
            for (int k = 2; k < i; k++)
                if (i % k == 0) {
                    flag = false;
                    break;
                }
        }
        assertTrue(flag);
    }
}
