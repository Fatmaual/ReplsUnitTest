package repls.repl239;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal dog2=new Dog("cat",4,"golden");
    @Test
    void getName() {
        assertEquals("cat",dog2.getName());
    }

    @Test
    void setName() {
        dog2.setName("faruk");
        assertEquals("faruk",dog2.getName());
    }

    @Test
    void getAge() {
        assertEquals(4,dog2.getAge());
    }

    @Test
    void setAge() {
        dog2.setAge(1940);
        assertEquals(1940,dog2.getAge());
    }
}