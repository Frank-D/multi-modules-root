package com.reproduce.testfixtures.uc.modb;

import com.reproduce.testfixtures.uc.moda.ProjectAUtility;

public class ProjectBUtility {

    public static void main(String[] args) {
        ProjectBUtility.print();
    }

    public static void print() {
        System.out.println(
                String.format("Hello, I am '%s' from '%s' module!",
                        getName(),
                        getModuleName()));

        System.out.println("I depend on: ");
        System.out.println(
                String.format("- %s.%s",
                        ProjectAUtility.getModuleName(),
                        ProjectAUtility.getName()));
    }

    public static String getName() {
        return "PROJECT-B-UTILITY";
    }

    public static String getModuleName() {
        return "PROJECT-B";
    }
}
