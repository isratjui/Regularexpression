
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//regular Expression selection mode
        FirstPart s1 = new FirstPart();
        Secondpart s2 = new Secondpart();
        Thirdpart s3 = new Thirdpart();
        Fourthpart s4 = new Fourthpart();
        Fifthpart s5 = new Fifthpart();
        Sixthpart s6 = new Sixthpart();
        System.out.println("Select the regular expression you want to check");
        System.out.println("Press 1 to check for a(bc)*de");
        System.out.println("Press 2 to check for a(bc)+de");
        System.out.println("Press 3 to check for a(bc)?de");
        System.out.println("Press 4 to check for [a-m]*");
        System.out.println("Press 5 to check for [^aeiou]");
        System.out.println("Press 6 to check for [^aeiou]{6}");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        try {
            while (flag) {
                int x = sc.nextInt();
                if (x == 1) {
                    s1.part1();
                } else if (x == 2) {
                    s2.part2();
                } else if (x == 3) {
                    s3.part3();
                } else if (x == 4) {
                    s4.part4();
                } else if (x == 5) {
                    s5.part5();
                } else if (x == 6) {
                    s6.part6();
                }
            }
        } catch (Exception e) {
            System.out.println("Wrong input please enter integers between 1 to 6 to choose then enter the string to check. Program ended please run again");
        }
    }
}
