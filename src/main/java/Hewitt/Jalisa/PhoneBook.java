package Hewitt.Jalisa;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jalisahewitt on 9/28/16.
 */
public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public void addContact(String name, String num) {
        ArrayList<String> newNums = new ArrayList<>();
        newNums.add(num);
        phoneBook.put(name, newNums);
    }

    public void addNum(String name, String newNum){
        for(String existing : phoneBook.keySet()){
            if(existing == name){
                ArrayList<String> addNum = phoneBook.get(name);
                addNum.add(newNum);
            }
        }
    }

    public void removeContact(String name, String num) {
        phoneBook.remove(name, num);
    }

    public void removeNum(String name, String num){
        for(String existing : phoneBook.keySet()){
            if(existing == name){
                ArrayList<String> addNum = phoneBook.get(name);
                if(addNum.contains(num)){
                    addNum.remove(num);
                }

            }
        }
    }

    public String lookUp(String name) {
        ArrayList<String> number = phoneBook.get(name);
        return number.toString();
    }

    public String allNames() {
        for (String x : phoneBook.keySet()) {
            return x;
        }
        return null;
    }

    public String reverseLookUp(String num) {
        for (String name : phoneBook.keySet()) {
            ArrayList<String> checkNum = phoneBook.get(name);
            if (checkNum.contains(num)) {
                return name;
           }
        }
        return null;

    }
}
