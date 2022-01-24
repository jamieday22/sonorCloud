package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kettle kettle = new Kettle();
        System.out.println(kettle);
        kettle.boilKettle();
        System.out.println(kettle);
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println(kettle);
    }
}
