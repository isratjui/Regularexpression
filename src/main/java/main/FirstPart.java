
package main;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.util.Scanner;
// Strings that are accepted by the regular expresion a(bc)*de

class FirstPart {

    public void part1() {
        boolean flaga = false;
        boolean flagb = false;
        boolean flagc = false;
        boolean flagde = false;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //checking for a at the beginning
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
        int b=0; int c=0;
        for (int i = 1; i < str.length() - 2;) {
            if (charArray[i] == 'b') {
                flagb = true;
                b++;
            } else {
                flagb = false;
                break;
            }
            i = i + 2;
        }
        for (int i = 2; i < str.length() - 2;) {
            if (charArray[i] == 'c') {
                flagc = true;
                c++;
            } else {
                flagb = false;
                break;
            }
            i = i + 2;
        }
        if (((flagb && flagc && flaga && flagde && b==c) == true) || ((str.length() == 3) && flaga == true && flagde == true)) {
            System.out.println("The regular expression a(bc)*de accepts the string " + str);
        } else {
            System.out.println("The regular expression a(bc)*de do not accepts the string " + str);
        }

    }
}
