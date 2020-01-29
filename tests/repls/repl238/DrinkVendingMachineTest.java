package repls.repl238;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkVendingMachineTest {
    DrinkVendingMachine vending = new DrinkVendingMachine(
            new Drink("Iced Coffee",4.50,10),
            new Drink("Iced Tea",2.50,5),
            new Drink("Smart Water",4.0,20),
            new Drink("Coke",2.30,13) );
    @Test
    void testSelectPositiveScenario() {
       vending.select(3);
       assertEquals(vending.current.getName(),"Coke");
        assertEquals(vending.isSelected,true);
    }
    @Test
    void testSelectNegativeScenario() {
        vending.select(120);
        assertEquals(vending.isSelected,false);
        assertEquals(vending.current,null);
    }

    @Test
    void testPay() {
        vending.select(3);
        vending.pay(1.30d);
        assertEquals(vending.amountLeftToPay,0.9999999999999998);
        assertEquals(vending.current.getQuantity(),12);
        assertEquals(vending.change,0);
        vending.pay(3);
        assertEquals(vending.amountLeftToPay,-2.0);
        assertEquals(vending.change,2.0);
    }

    @Test
    void testReturnChange() {
    vending.select(3);
    vending.pay(2.30);
    assertEquals(vending.amountLeftToPay,0.0);
    assertEquals(vending.change,0.0);
    }

    @Test
    void testCancel() {
        vending.select(3);
        vending.cancel();
        assertEquals(vending.current,null);
        assertEquals(vending.amountLeftToPay,0);
        assertEquals(vending.change,0);
        assertEquals(vending.isSelected,false);
    }
}