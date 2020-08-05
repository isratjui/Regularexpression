
package main;

import java.util.Scanner;
// Strings that are accepted by the regular expresion [^aeiou]

public class Fifthpart {

    public void part5() {
        boolean flag = false;
        int ascii;
        System.err.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArray = str.toCharArray();
        int[] temp = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            ascii = (int) charArray[i];
            temp[i] = ascii;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 97 || temp[i] == 101 || temp[i] == 105 || temp[i] == 111 || temp[i] == 117) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("The regular expression [^aeiou] does not accept the string " + str);
        } else {
            System.out.println("The regular expression [^aeiou] accepts the string " + str);
        }
    }

}
