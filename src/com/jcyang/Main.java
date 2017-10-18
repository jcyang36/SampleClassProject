package com.jcyang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        Person newPerson = new Person();
        System.out.print("Enter person's first name: ");
        newPerson.setFirstName(keyboard.nextLine());
        System.out.print("Enter person's last name: ");
        newPerson.setLastName(keyboard.nextLine());
        System.out.print("Enter person's address: ");
        newPerson.setAddress(keyboard.nextLine());
        System.out.println("Enter person's phone number: ");
        newPerson.setPhoneNumber(keyboard.nextLine());
        System.out.println("Enter person's email: ");
        newPerson.setEmail(keyboard.nextLine());
        System.out.println("First name: "+newPerson.getFirstName());
        System.out.println("Last name: "+ newPerson.getLastName());
        System.out.println("Address: "+newPerson.getAddress());
        System.out.println("Phone number: " +newPerson.getPhoneNumber());
        System.out.println("Email: "+newPerson.getEmail());

    }
}
