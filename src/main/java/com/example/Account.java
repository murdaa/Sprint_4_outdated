package com.example;
import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

       if      (name.length() >= 3
               && name.length() <= 19
               && StringUtils.containsWhitespace(name)
               && !StringUtils.startsWith(name, " ")
               && !StringUtils.endsWith(name, " ")
               )
       {
           System.out.println("Entered valid name: " + name + ".");
            return true;
       }
       else {
           System.out.println("Entered invalid name: " + name + ". Please enter a valid name.");
            return false;
    }

    }
}
