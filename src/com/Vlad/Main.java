package com.Vlad;

import java.util.Scanner;

public class Main {

    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        System.out.println("Phone is on....");
        printMenu();
        while (chooseFromMenu()) {
            printMenu();
        }
        System.out.println("Shutting down....");
    }

    private static void printMenu() {
        System.out.println("\nWhat would you like to do?:");
        System.out.println("1 - Add new contact\n2 - Edit a contact\n3 - Search for a name\n4 - Search for a number" +
                "\n5 - Delete a contact\n6 - Show contact list\n7 - Quit");
    }


    public static boolean chooseFromMenu() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1 -> {
                phone.addNewContact(new Contact());
                return true;
            }
            case 2 -> {
                phone.modifyContact();
                return true;
            }
            case 3 -> {
                phone.findName();
                return true;
            }
            case 4 -> {
                phone.findNumber();
                return true;
            }
            case 5 -> {
                phone.removeContact();
                return true;
            }
            case 6 -> {
                phone.printList();
                return true;
            }
            case 7 -> {
                return false;
            }
        }
        System.out.println("Invalid input");
        return true;
    }
}