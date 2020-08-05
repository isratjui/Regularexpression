
package main;
import java.util.Scanner;
// Strings that are accepted by the regular expresion [^aeiou]{6}
public class Sixthpart {
public void part6() {
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
            if(temp[i]==97 || temp[i]==101 || temp[i]==105 || temp[i]==111 || temp[i]==117){
            flag=true;
            }
        }
        if(flag==false && str.length()==6){
           System.out.println("The regular expression [^aeiou]{6} accepts the string "+str); 
        }
        else{
         
         System.out.println("The regular expression [^aeiou]{6} does not accept the string "+str);
        }
    }

}
