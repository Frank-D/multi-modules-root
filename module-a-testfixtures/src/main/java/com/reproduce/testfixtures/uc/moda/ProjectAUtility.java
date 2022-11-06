package com.reproduce.testfixtures.uc.moda;

public class ProjectAUtility {

    public static void main(String[] args) {
        ProjectAUtility.print();
    }

    public static void print() {
        System.out.println(
                String.format("Hello, I am '%s' from '%s' module!",
                        getName(),
                        getModuleName()));
    }

    public static String getName() {
        return "PROJECT-A-UTILITY";
    }

    public static String getModuleName() {
        return "PROJECT-A";
    }
}
