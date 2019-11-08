package com.example.lib;

public class MyClass {
    public static void main(String[] argv){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("input time(hour)");
        int h =scanner.nextInt();
        System.out.println("input time(min)");
        int m =scanner.nextInt();
            if( (h>=7 && m>=30))
            {
                    System.out.println("School time");
            }
            else
            {
                System.out.println("After School time");
            }
    }
}
