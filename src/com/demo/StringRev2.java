package com.demo;

public class StringRev2 {
public static void main(String[] args) {
	String str ="My name is pravin";
	String rev="";
	String word[]=str.split(rev);
	for(int i =str.length()-1;i>=0;i--) {
		System.out.print(word[i]+"");
	}
}
}
