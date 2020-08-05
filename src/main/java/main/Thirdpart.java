
package main;

import java.util.Scanner;
// Strings that are accepted by the regular expresion a(bc)+de

public class Thirdpart {

    public void part3() {
        boolean flaga = false;
        boolean flagb = false;
        boolean flagc = false;
        boolean flagde = false;
        System.err.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //checking for a at the beginning
        try {
            char[] charArray = str.toCharArray();
            if (charArray[0] == 'a') {
                flaga = true;
            } else {
                flaga = false;
            }
            //checking for de at the end
            int length = (charArray.length) - 1;
            if (charArray[length] == 'e') {
                if (charArray[length - 1] == 'd') {
                    flagde = true;
                } else {
                    flagde = false;
                }
            }

            //checking for (bc)*
            if (charArray[1] == 'b') {
                flagb = true;
            }
            if (charArray[2] == 'c') {
                flagc = true;
            }

            if (((flagb && flagc && flaga && flagde && (str.length() <= 5)) == true) || ((flaga && flagde && (str.length() <= 3)) == true)) {
                System.out.println("The regular expression a(bc)?de accepts the string " + str);
            } else {
                System.out.println("The regular expression a(bc)?de do not accepts the string " + str);
            }
        } catch (Exception e) {
            System.out.println("The regular expression a(bc)?de do not accepts the string " + str);
        }
    }
}
