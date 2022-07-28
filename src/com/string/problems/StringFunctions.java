package com.string.problems;

public class StringFunctions {

    public static void main(String[] args)
    {
        String str = "Fantastic";
        String str2 = "   Fantastic   ";
        String str1 = new String("Fantastic");

        //Basic String Functions
        //Length
        int len = str.length();// 10
        System.out.println(len);
        //character at index i.
        char ch = str.charAt(5);// a
        //Find index of character n
        int index = str.indexOf('a');//1
        //Find a substring.
        String sub = str.substring(2);//begin index is always inclusive -- nstastic
        String sub1 = str.substring(2,6);//begin index is inclusive and end index is not inclusive -- nsta
        //to convert a String to a char Array.
        char[] arr = str.toCharArray();//{'F','a','n','s','t','a','s','t','i','c'};
        //there isnt any method to reverse a String.
        //to convert to lowercase
        String s2 = str.toLowerCase();//fantastic
        //convert to UpperCase
        String s3 = str.toUpperCase();//FANTASTIC
        //to remove spaces
        System.out.println(str2.trim());
        //replace character a,b,c with z in the given string
        System.out.println(str1.replace('a','b'));//it will replace all the 'a' character with 'b'
        //equals
        str.equals(str2);
        //
        str.equalsIgnoreCase(str2);//case insensitive






    }
}
