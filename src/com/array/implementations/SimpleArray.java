package com.array.implementations;

public class SimpleArray {

    public static void main(String[] args) {
        //why
        //public -- least retrictive access specifier which means it can be accesible
        //static -- since main method is the starting point for any java program execution JVM cannot create an Instance of it
        //that is why it is declared static. SimpleArray.main();
        //void since this is starting point
        //non static methods can be called from inside static methods by creating an instance of the class in whihc it belongs.
        // int[] numbers = new int[5];
        int[] numbers = {3,4,5,6,12};
        findMaximum(numbers);


    }
    public static void findMaximum(int[] max)
    {
       //to find the maximum
    }

}


