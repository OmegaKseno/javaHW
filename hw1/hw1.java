package org.example.hw1;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        String a = " the sky is blue ";
        System.out.println(coupString(a));
    }

    /**
     *
     * @param str - Принимает строку
     * @return - Перевернутая строка
     */
    public static String coupString(String str) {
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            result += " " + arr[i];
        }
        return result.trim();

    }

}




