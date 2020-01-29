package repls.Repl237;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {
    Catalog ctl = new Catalog();
    @Test
    void loadItems() {
        ctl.loadItems();
        String item=ctl.items.get(ctl.items.size()-1);
        assertEquals("Apple Watch",item);
    }

    @Test
    void loadPrices() {
        ctl.loadPrices();
        double price=ctl.prices.get(ctl.prices.size()-2);
        assertEquals(2199.0,price);
    }

    @Test
    void loadMonthlyPayments() {
        ctl.loadMonthlyPayments();
        double mP=ctl.monthlyPayments.get(0);
        assertEquals(mP,18.71);
    }

    @Test
    void loadWholeCatalog() {
        ctl.loadWholeCatalog();
        String item=ctl.items.get(ctl.items.size()-1);
        assertEquals("Apple Watch",item);
        double price=ctl.prices.get(ctl.prices.size()-2);
        assertEquals(2199.0,price);
        double mP=ctl.monthlyPayments.get(0);
        assertEquals(mP,18.71);
    }

    @Test
    void getWholeCatalog() {
        ctl.loadWholeCatalog();
        assertEquals("iPhone 6s-449.0-18.71\n" +
                "iPhone 6s Plus-549.0-22.88\n" +
                "iPhone X-1149.0-56.16\n" +
                "MacbookPro-1499.99-79.49\n" +
                "ThumbDrive-39.99-2.68\n" +
                "Beats HeadPhones-349.99-15.12\n" +
                "Mouse-79.99-8.98\n" +
                "Charger-39.99-4.56\n" +
                "iPad-429.0-18.31\n" +
                "Dyson Vacuum-399.0-16.25\n" +
                "TV-2199.0-89.49\n" +
                "Apple Watch-559.0-21.18\n" +
                "iPhone 6s-449.0-18.71\n" +
                "iPhone 6s Plus-549.0-22.88\n" +
                "iPhone X-1149.0-56.16\n" +
                "MacbookPro-1499.99-79.49\n" +
                "ThumbDrive-39.99-2.68\n" +
                "Beats HeadPhones-349.99-15.12\n" +
                "Mouse-79.99-8.98\n" +
                "Charger-39.99-4.56\n" +
                "iPad-429.0-18.31\n" +
                "Dyson Vacuum-399.0-16.25\n" +
                "TV-2199.0-89.49\n" +
                "Apple Watch-559.0-21.18\n",ctl.getWholeCatalog().toString());
    }

    @Test
    void getItemDetailsPositiveScenario() {
        ctl.loadWholeCatalog();
        String t=ctl.getItemDetails(ctl.items.get(ctl.items.size()-2));
        assertEquals("TV-2199.0-89.49",t);
    }
    @Test
    void getItemDetailsNegativeScenario() {
        ctl.loadWholeCatalog();
        String t=ctl.getItemDetails("adana");
        assertEquals(null,t);
    }

    @Test
    void getItemsLessThanAMonthlyPrice() {
        ctl.loadWholeCatalog();
        ArrayList<String> ls=ctl.getItemsLessThanAMonthlyPrice(4);
        assertEquals(Arrays.asList("ThumbDrive-39.99-2.68","ThumbDrive-39.99-2.68"),ls);
    }

    @Test
    void updatePrice() {
        ctl.loadWholeCatalog();
        ctl.updatePrice("ThumbDrive",1940);
        String item=ctl.getItemDetails("ThumbDrive");
        assertEquals("ThumbDrive-1940.0-161.66666666666666",item);
    }

    @Test
    void deleteItemFromCatalog() {
        ctl.loadWholeCatalog();
        ctl.deleteItemFromCatalog("TV");
        assertEquals("Dyson Vacuum",ctl.items.get(ctl.items.size()-2));
    }
}