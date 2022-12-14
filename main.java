import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {


    static boolean isLeap(int year){
        if(year<1918){
            if(year%4==0){
                return true;
            }else{
                return false;
            }
        }else{
            if(year%400==0 || (year%4==0 && year%100 != 0)){
                return true;
            }else{
                return false;
            }
        }

    }
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
            if(year == 1918){
                return "26.09.1918";
            }
            if(isLeap(year)){
                return "12.09." + year;
            }else{
                return "13.09." + year;
            }

    }

    public static void main(String[] args)   {
        String result = dayOfProgrammer(1918);
        System.out.println(result);
    }
}
