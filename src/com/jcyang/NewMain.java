package com.jcyang;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args){
        Student newStudent = new Student();
        ArrayList<Person> myAddressBook= new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String choice;
        newStudent.setFirstName("Abena");
        newStudent.setLastName("Asamoah");
        newStudent.setEmail("abena@asamoah.com");

        myAddressBook.add(newStudent);

        System.out.println("Enter new (s)tudent details: ");
        System.out.println("Add new (t)eacher details: ");
        System.out.println("Add (c)ourse to student: ");
        System.out.println("Add c(o)urse to teacher: ");
        choice= keyboard.nextLine();
    }
}
