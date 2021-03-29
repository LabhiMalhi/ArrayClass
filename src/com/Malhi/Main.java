package com.Malhi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String[] arr = {"Werner","Ziyech","Havertz","Pulisic"};
        Scanner s = new Scanner(System.in);
        /**System.out.print("Enter a name => ");
        String n = s.nextLine();
        System.out.println(n);**/
        String n = "Werner";
        String m = "Havertz";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,"Pulisic"));



    }
    public static boolean array(String[] a, String n) {
        for (String str: a) {
            if (str == n) {
                return true;
            }
        }
        return false;
    }

}
