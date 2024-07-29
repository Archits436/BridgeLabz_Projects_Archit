package com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static void addcontact(HashMap<String,Contact> memberinfo){
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
        long phone = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter User Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact();
        contact.set(first_name,last_name,address,city,state,zip,phone,email);
        memberinfo.put(first_name+" "+last_name,contact);
        System.out.println("User Added !!!");
        System.out.println("");
    }


    public static void editcontact(HashMap<String,Contact> memberinfo){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Firstname: ");
        String first_name = sc.nextLine();

        System.out.println("Enter Lastname: ");
        String last_name = sc.nextLine();

        if(memberinfo.containsKey(first_name+" "+last_name)){
            System.out.println("User found !! Enter Other Details");

            System.out.println("Enter User Address: ");
            String address = sc.nextLine();

            System.out.println("Enter User City: ");
            String city = sc.nextLine();

            System.out.println("Enter User State: ");
            String state = sc.nextLine();

            System.out.println("Enter User ZIP: ");
            int zip = sc.nextInt();

            System.out.println("Enter User Phone No: ");
            long phone = sc.nextLong();
            sc.nextLine();

            System.out.println("Enter User Email: ");
            String email = sc.nextLine();

            Contact contact = new Contact();
            contact.set(first_name,last_name,address,city,state,zip,phone,email);
            memberinfo.replace(first_name+" "+last_name,contact);
            System.out.println("User Updated !!!");
            System.out.println("");
        }
        else{
            System.out.println("User Not Found !!");
        }
    }
}