package se.ecutb.grupparbeteVendingMachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Model.*;
import org.junit.Before;
import org.junit.Test;


public class AppTest {


    Product test = new Mat(50, "Kebab", "650", 1, "nasty stuff");
    Product testGodis = new Godis(25, "Toblerone", "1200", 2, "Nuts");
    Product testDricka = new Dricka(10, "Vatten", "0", 3, "Water");


    Product[] array = {test, testGodis, testDricka};
    ImplementVendingMachine tester = new ImplementVendingMachine(array);


    {


    }

    @Test
    public void test_request() {
        int testProductnummber = 1;
        Product expected = array[0];
        Product actual = tester.productRequest(testProductnummber);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_currency() {

        int expected = 50;

        tester.addCurrency(AcceptedAmount.FIFTY);
        int actual = tester.getBalance();
        assertEquals(expected, actual);


    }

    @Test
    public void test_Description() {
        int testNumber = 1;
        String expected = array[0].examaninerad();
        String actual = tester.getDescription(testNumber);
        assertEquals(expected, actual);
    }

    @Test
    public void test_examaninerad() {
        String expected = "Product info: Kebab Price: 50 Calories: 650 Contains: nasty stuffProductnumber: 1";
        String actual = array[0].examaninerad();
        assertEquals(expected, actual);
    }

    @Test
    public void test_getProducts() {
        String[] expected = {"Kebab", "Toblerone", "Vatten"};
        String[] actual = tester.getProducts();
        assertEquals(expected, actual);


    }

    @Test
    public void test_endSession () {
        tester.addCurrency(AcceptedAmount.FIFTY);
        int expected = 50;
        int actual = tester.endSession();
        assertEquals(expected, actual);

        assertEquals(0, tester.getBalance());





    }
}


