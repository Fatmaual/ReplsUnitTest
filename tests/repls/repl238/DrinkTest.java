package repls.repl238;

import org.junit.*;
import repls.repl238.Drink;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DrinkTest {
    Drink dr=new Drink("Iced Coffee",4.50,10);
    @Test
    void testToString() {
        assertEquals(dr.toString(),"Drink{name='Iced Coffee', cost=4.5, quantity=10}");
    }

    @Test
    void getName() {
        assertEquals(dr.getName(),"Iced Coffee");
    }

    @Test
    void setName() {
        dr.setName("fatih");
        assertEquals(dr.getName(),"fatih");
    }

    @Test
    void getCost() {
        assertEquals(dr.getCost(),4.50);
    }

    @Test
    void setCost() {
        dr.setCost(5.60);
        assertEquals(dr.getCost(),5.60);
    }

    @Test
    void getQuantity() {
        assertEquals(dr.getQuantity(),10);
    }

    @Test
    void setQuantity() {
        dr.setQuantity(1940);
        assertEquals(dr.getQuantity(),1940);
    }
}