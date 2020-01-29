package repls.repl239;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest  {
    Dog dog1=new Dog("poppy",2,"dogo");
    Dog dog2=new Dog("cat",4,"golden");
    Dog dog3=new Dog("poppy",2,"dogo");
    @Test
    void testGetAgeInHumanYears() {
        assertEquals(22,dog1.getAgeInHumanYears());
        assertEquals(32,dog2.getAgeInHumanYears());
    }

    @Test
    void testToString() {
        String actual="Name: poppy\n" +
                "Breed: dogo\n" +
                "Age in calendar years: 2\n" +
                "Age in human years: "+dog1.getAgeInHumanYears();
        assertEquals(actual,dog1.toString());
    }

    @Test
    void getBreed() {
        assertEquals("dogo",dog1.getBreed());
    }

    @Test
    void setBreed() {
        dog1.setBreed("karabas");
        assertEquals("karabas",dog1.getBreed());
    }

    @Test
    void testEquals() {
        assertTrue(dog1.equals(dog3));
    }
}