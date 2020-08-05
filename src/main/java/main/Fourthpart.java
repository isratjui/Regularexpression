
package main;

import java.util.Scanner;
// Strings that are accepted by the regular expresion [a-m]*

public class Fourthpart {

    public void part4() {
        boolean flaga = false;
        boolean flagb = false;

        int ascii;
        System.err.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //checking for a at the beginning
        char[] charArray = str.toCharArray();
        int[] temp = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            ascii = (int) charArray[i];
            temp[i] = ascii;
        }
        for (int i = 0; i < temp.length; i++) {
            if ((temp[i] >= 97) && (temp[i] <= 109)) {
                flaga = true;

            } else {
                flaga = false;
                break;
            }
        }

        if (flaga == true) {
            System.out.println("The regular expression [a-m]* accepts the string " + str);
        } else {
            System.out.println("The regular expression [a-m]* does not accepts the string " + str);
        }

    }

}
