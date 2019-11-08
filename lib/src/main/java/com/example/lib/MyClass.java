package com.example.lib;

public class MyClass {
    public static void main(String[] argv){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int h =scanner.nextInt();
        int m =scanner.nextInt();

        {
            if( (h==7 && m>=30) || ( h<=17) )
            {
                System.out.println("School time");
            }
            else
            {
                System.out.println("After School time");
            }
        }
    }
}
