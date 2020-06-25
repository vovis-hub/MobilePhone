package com.Vlad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public MobilePhone() {

    }

    private int findByInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(number)) {
                return i;
            }
        }
        System.out.println(number + " not found");
        return -1;
    }

    private int findByInputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int findByName(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact1 = contacts.get(i);
            if (contact1.getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private boolean checkItem(Contact contact) {
        return (findByName(contact) >= 0);
    }

    public void addNewContact(Contact contact) {
        if (!checkItem(contact)) {
            contacts.add(contact);
            System.out.println("Contact " + contact.getName() + " added");
        } else {
            System.out.println("Contact " + contact.getName() + " already listed");
        }
    }

    public void modifyContact() {
        Scanner scanner = new Scanner(System.in);
        int i = findByInputName();
        Contact contact = contacts.get(i);
        while (true) {
            System.out.println("1 - Edit name\n2 - Edit number");
            int x = scanner.nextInt();
            if (x==1) {
                System.out.println("Please enter new name:");
                String newName = scanner.nextLine();
                contact.editName(newName);
                break;
            } else if (x==2) {
                System.out.println("Please enter new number:");
                String newNumber = scanner.nextLine();
                contact.editNumber(newNumber);
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("Contact " + contact.getName() + " modified");
    }


    public void removeContact() {
        int i = findByInputName();
        Contact contact = contacts.get(i);
        if (checkItem(contact)) {
            contacts.remove(contact);
            System.out.println("Contact " + contact.getName() + " removed");
        } else {
            System.out.println("Contact " + contact.getName() + " not found");
        }
    }

    public void printList() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).getName() + " - "
                    + contacts.get(i).getPhoneNumber());
        }

    }

    public void findName() {
        int i = findByInputName();
        if (i >= 0) {
            Contact contact = contacts.get(i);
            System.out.println("Found contact:\n " + contacts.get(i).getName() + " - "
                    + contacts.get(i).getPhoneNumber());
        } else {
            System.out.println("Contact not found");
        }
    }


    public void findNumber() {
        int i = findByInputNumber();
        if (i >= 0) {
            Contact contact = contacts.get(i);
            System.out.println("Found contact:\n " + contacts.get(i).getName() + " - "
                    + contacts.get(i).getPhoneNumber());
        } else {
            System.out.println("Contact not found");
        }
    }

}
