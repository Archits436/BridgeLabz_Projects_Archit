package com.addressbook;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Firstname: ");
        String first_name = sc.nextLine();

        System.out.println("Enter User Lastname: ");
        String last_name = sc.nextLine();

        System.out.println("Enter User Address: ");
        String address = sc.nextLine();

        System.out.println("Enter User City: ");
        String city = sc.nextLine();

        System.out.println("Enter User State: ");
        String state = sc.nextLine();

        System.out.println("Enter User ZIP: ");
        int zip = sc.nextInt();

        System.out.println("Enter User Phone No: ");
        int phone = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter User Email: ");
        String email = sc.nextLine();

        contact.set(first_name,last_name,address,city,state,zip,phone,email);
        System.out.println("User Added !!!");

    }
}