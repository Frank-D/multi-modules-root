package com.reproduce.testfixtures.uc.modc;

import com.reproduce.testfixtures.uc.moda.ProjectAUtility;
import com.reproduce.testfixtures.uc.modb.ProjectBUtility;

public class ProjectCUtility {

    public static void main(String[] args) {
        ProjectCUtility.print();
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

        System.out.println(
                String.format("- %s.%s",
                        ProjectBUtility.getModuleName(),
                        ProjectBUtility.getName()));
    }

    public static String getName() {
        return "PROJECT-C-UTILITY";
    }

    public static String getModuleName() {
        return "PROJECT-C";
    }
}
