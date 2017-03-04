package com.company;

public class Main {

    public static void main(String[] args) {
        Integer value = 1;
        Double valueDouble = 23.1414;
        Integer value2 = 2;
        Double sum = Double.valueOf(value2 + value);
        Boolean isCar = true;


        if(isCar){
            System.out.println("car is true");
        }

        System.out.println(sum);

        System.out.println(value);
        System.out.println(valueDouble);
        System.out.println("Hello World");
    }
}
