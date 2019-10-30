package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Dame una mayúscula:");
        String letra = scanner.next();
        int n=(int)letra.charAt(0);
        char soluc=(char)(n+32);
        System.out.print("La minúscula es: "+soluc);
    }
}
