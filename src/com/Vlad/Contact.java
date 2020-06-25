package com.Vlad;

import java.util.Scanner;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a name");
        String name = scanner.nextLine();
        System.out.println("Please, enter a number");
        String number = scanner.nextLine();
        this.name = name;
        this.phoneNumber = number;
    }

    private void setName(String name) {
        this.name = name;
    }

   private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void editName(String name) {
        setName(name);
    }

    public void editNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

}

