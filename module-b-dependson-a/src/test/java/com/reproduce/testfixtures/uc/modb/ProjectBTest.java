package com.reproduce.testfixtures.uc.modb;

import com.reproduce.testfixtures.uc.moda.ProjectATestfixture;

public class ProjectBTest {

    public static void main(String[] args) {
        ProjectBTest.print();
    }

    public static void print() {
        System.out.println(
                String.format("Hello, I am '%s' from '%s' module!",
                        getName(),
                        ProjectBUtility.getModuleName()));

        System.out.println("I depend on: ");
        System.out.println(
                String.format("- %s.%s",
                        ProjectATestfixture.getModuleName(),
                        ProjectATestfixture.getName()));
    }

    public static String getName() {
        return "PROJECT-B-TEST";
    }
}
