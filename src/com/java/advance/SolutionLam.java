package com.java.advance;
import java.io.*;
import java.util.*;

import javax.print.DocFlavor.BYTE_ARRAY;

@FunctionalInterface
interface PerformOperations {
 boolean check(int a);
}
class MyMaths{
 public static boolean checker(PerformOperations p, int num) {
  return p.check(num);
 }
 
 public PerformOperations isOdd() {
	 return (a)->{return a%2!=0;};
 }
 
 public PerformOperations isPrime() {
	 return (a)->{
		 for (int i = 2; i < a/2; i++) {
			 if (a%i==0) {
				return false;
			}
		}
		 return true;
	 };
 }
 public PerformOperations isPalindrome() {
	 return (a)->{
		 int sum =0;
		 int r = 0;
		 int n =a;
		 while (n>0) {
			 r = n%10;
			 sum =  sum*10 + r;
			 n/=10;
		}
		return (a == sum);
		 
		 
	 };
 }
 
}
    
   // Write your code here

public class SolutionLam {

 public static void main(String[] args) throws IOException {
  MyMaths ob = new MyMaths();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperations op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   String[] split = s.split("\\s");
   int ch = Integer.parseInt(split[0]);
   int num = Integer.parseInt(split[1]);
   if (ch == 1) {
//    op = ob.isOdd();
    ret = MyMaths.checker(new PerformOperations() {
		
		@Override
		public boolean check(int a) {
			if (a%2!=0) {
				return true;
			}
			return false;
		}
	}, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
//    op = ob.isPrime();
    ret = MyMaths.checker(new PerformOperations() {
		
		@Override
		public boolean check(int a) {
			for (int i = 2; i < a/2; i++) {
				if (a%i == 0) {
					return false;
					
				}
			}
			return true;
		}
	}, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
