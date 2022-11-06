package com.reproduce.testfixtures.uc.moda;

public class ProjectATestfixture {

    public static void main(String[] args) {
        ProjectATestfixture.print();
    }

    public static void print() {
        System.out.println(
                String.format("Hello, I am '%s' from '%s' module!",
                        getName(),
                        getModuleName()));
    }

    public static String getName() {
        return "PROJECT-A-TESTFIXTURE";
    }

    public static String getModuleName() {
        return "PROJECT-A";
    }
}
