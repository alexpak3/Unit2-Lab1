import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTester {


    @Test
    void addBookTest(){
        Store store = new Store();
        Book book = new Book();
        store.addBook(book);
        assertTrue(true);

    }

    @Test
    void addPhoneTest(){
        Store store = new Store();
        Book book = new Book();
        Phone phone = new Phone();
        store.addPhone(phone);
        store.addBook(book);
        assertTrue(true);

    }

    @Test
    void updateLocationandgetAllPhonestest(){
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addPhone(phone3);
        store.updatePhonesLocation("Room 512");

        ArrayList<Phone> allP = new ArrayList<>();
        allP = store.getAllPhones();

        assertEquals(allP.get(0).getLocation(), "Room 512");
        assertEquals(allP.get(1).getLocation(), "Room 512");
        assertEquals(allP.get(2).getLocation(), "Room 512");

        assertTrue(true);
    }


    @Test
    void testCase1(){
        Store store = new Store();
        Arduino arduino = new Arduino();
        Book book = new Book();
        Book book2 = new Book();
        Phone phone = new Phone();
        Phone phone2= new Phone();


        store.addBook(book2);
        store.addPhone(phone);
        store.addPhone(phone2);
        store.addArduino(arduino);
        store.addBook(book);

       store.getItemType("phone");
       System.out.println(store.getItemType("phone"));
       assertTrue (true);
    }

    @Test
    void testcaseupdate(){
        Store store = new Store();
        Arduino arduino = new Arduino();
        Book book = new Book();
        Book book2 = new Book();
        Phone phone = new Phone();
        Phone phone2= new Phone();
        store.addBook(book2);
        store.addPhone(phone);
        store.addPhone(phone2);
        store.addArduino(arduino);
        store.addBook(book);
        store.updateItem("book", "title", "new name");
    }


}
