package com.reproduce.testfixtures.uc.modc;

import com.reproduce.testfixtures.uc.moda.ProjectATestfixture;

public class ProjectCTest {

    public static void main(String[] args) {
        ProjectCTest.print();
    }

    public static void print() {
        System.out.println(
                String.format("Hello, I am '%s' from '%s' module!",
                        getName(),
                        ProjectCUtility.getModuleName()));

        System.out.println("I depend on: ");
        System.out.println(
                String.format("- %s.%s",
                        ProjectATestfixture.getModuleName(),
                        ProjectATestfixture.getName()));
    }

    public static String getName() {
        return "PROJECT-C-TEST";
    }
}
