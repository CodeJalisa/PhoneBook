package Hewitt.Jalisa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jalisahewitt on 9/28/16.
 */
public class PhoneBookTest {

    @Test
    public void addContactTest(){
        PhoneBook testAdd = new PhoneBook();
        testAdd.addContact("Jalisa", "555555555");
        String expected = "Jalisa";
        String actual = testAdd.allNames();
        assertEquals("Should have added Jalisa to phone book", expected, actual);
    }

    @Test
    public void removeContactTest(){
        PhoneBook testRemove = new PhoneBook();
        testRemove.addContact("Jalisa", "555555555");
        testRemove.addContact("Aaron", "302555555");
        testRemove.removeContact("Jalisa", "555555555");
        String expected = "Aaron";
        String actual = testRemove.allNames();
        assertEquals("Should have removed Jalisa to phone book", expected, actual);


    }

    @Test
    public void lookUpTest(){
        PhoneBook testLookUp = new PhoneBook();
        testLookUp.addContact("Jalisa", "555555555");
        testLookUp.addContact("Aaron", "302555555");
        String expected = "302555555";
        String actual = testLookUp.lookUp("Aaron");
        assertEquals("Should have showed Aarons number from phone book", expected, actual);

    }

    @Test
    public void revereLookUpTest(){
        PhoneBook testReverseLookUp = new PhoneBook();
        testReverseLookUp.addContact("Jalisa", "555555555");
        testReverseLookUp.addContact("Aaron", "302555555");
        String expected = "Jalisa";
        String actual = testReverseLookUp.reverseLookUp("555555555");
        assertEquals("Should have showed Jalisa's name from phone book", expected, actual);
    }

    @Test
    public void addNumTest(){
        PhoneBook testAddNum = new PhoneBook();
        testAddNum.addContact("Jalisa", "555555555");
        testAddNum.addContact("Aaron", "302555555");
        testAddNum.addNum("Jalisa", "30245555");
        String expected = "Jalisa";
        String actual = testAddNum.reverseLookUp("30245555");
        assertEquals("Should have showed Jalisa's name from phone book", expected, actual);
    }

    @Test
    public void removeNumTest(){
        PhoneBook testRemoveNum = new PhoneBook();
        testRemoveNum.addContact("Jalisa", "555555555");
        testRemoveNum.addContact("Aaron", "302555555");
        testRemoveNum.addNum("Jalisa", "30245555");
        testRemoveNum.removeNum("Jalisa", "30245555");
        String expected ="[555555555]";
        String actual = testRemoveNum.lookUp("Jalisa");
        assertEquals("Should have removed Jalisa's second number from phone book", expected, actual);
    }

}
