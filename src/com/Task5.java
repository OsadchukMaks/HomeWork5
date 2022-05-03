package com;

public class Task5 {
    public static String abbrevName(String name) {

        String[] names = name.split(" ");

        String firstName = names[0];
        String lastName = names[1];

        String ch1 = String.valueOf(firstName.charAt(0)).toUpperCase();
        String ch2 = String.valueOf(lastName.charAt(0)).toUpperCase();

        return ch1.concat(".").concat(ch2);
    }
}
