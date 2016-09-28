package Hewitt.Jalisa;

import java.util.HashMap;

/**
 * Created by jalisahewitt on 9/28/16.
 */
public class PhoneBook {

    HashMap<String, String> phoneBook = new HashMap<String, String>();

    public PhoneBook() {
    }

    public void addContact(String name, String num) {
        phoneBook.put(name, num);
    }

    public void removeContact(String name, String num) {
        phoneBook.remove(name, num);
    }

    public String lookUp(String name) {
        String number = phoneBook.get(name);
        return number;
    }

    public String allNames() {
        for (String x : phoneBook.keySet()) {
            return x;
        }
        return null;
    }

    public String reverseLookUp(String num) {
        for (String name : phoneBook.keySet()) {
            if (phoneBook.get(name) == num) {
                return name;
           }
        }
        return null;

    }
}
