package com.java.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println(firstMultipleInput[0]);
        
	
//		 int m = Integer.parseInt(firstMultipleInput[0]);System.out.println(m);
//		 int n = Integer.parseInt(firstMultipleInput[1]); System.out.println(n);
		 List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());
       System.out.println("magzine"+magazine);
       System.out.println("note"+note);
//        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}

