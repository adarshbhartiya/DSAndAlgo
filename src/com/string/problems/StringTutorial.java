package com.string.problems;

public class StringTutorial {

    public static void main(String[] args)
    {
        //String is a class in Java.
        //String is represented by double quotes.
        //String is a immutable class.(Meaning).
        //Java objects always resides in heap memory ..Stack and Heap
        //StringPooL is a designated area where strings literals are stored

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");





        //what is the difference between == and equals..
        /**
         *  == It basically checks the reference or the address of the two operators whether they are equal or not
         *  equals() - it checks the content of the two operators.
         *
         *
         */

        System.out.println(s1 == s2);//true exact result
        System.out.println(s3 == s1);//false


        System.out.println(s1.equals(s2));//true
        System.out.println(s2.equals(s3));//true
    }

}
