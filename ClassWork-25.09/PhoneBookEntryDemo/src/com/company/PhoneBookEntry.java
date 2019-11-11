package com.company;

import java.util.Objects;

public class PhoneBookEntry {
    private String name;
    private String number;

    PhoneBookEntry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return "name " + this.name + " number " + this.number;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhoneBookEntry) {
            PhoneBookEntry that = (PhoneBookEntry) obj;
           return this.name.equals(that.name) && this.number.equals(that.number);
        }
        else {
            return false;
        }
    }

//    public int hashCode(){
//        int hash = 7;
//        hash = 31 * hash + name.hashCode();
//        hash = 31 * hash + number.hashCode();
//        return hash;
//    }
    public int hashCode(){
        return Objects.hash(name, number);
    }

}
