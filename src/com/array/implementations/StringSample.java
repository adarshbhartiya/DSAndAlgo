package com.array.implementations;

public class StringSample {


    public static void main(String[] args)
    {
        String s1 = "SIMPLE";
        String s2 = "SIMPLE";
        String s3 = new String("SIMPLE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println('a' == 97);

        System.out.println(true == true);

    }
}
