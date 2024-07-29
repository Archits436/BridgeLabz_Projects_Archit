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

        if(memberinfo.containsKey(first_name+" "+last_name)){
            System.out.println("Sorry This User Already Exists !!!");
            System.out.println("");
            return;
        }
        else{
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

    public static void deletecontact(HashMap<String, Contact> memberinfo){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Firstname: ");
        String first_name = sc.nextLine();

        System.out.println("Enter Lastname: ");
        String last_name = sc.nextLine();

        if(memberinfo.containsKey(first_name+" "+last_name)){
            memberinfo.remove(first_name+" "+last_name);
            System.out.println("User Deleted !!!");
            System.out.println("");
        }
        else{
            System.out.println("User Not Found !!!");
            System.out.println("");
        }
    }

    public static void addmultiplecontact(HashMap<String,Contact> memberinfo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements you want to add: ");
        int no = sc.nextInt();

        for(int i=1;i<=no;i++){
            System.out.println("");
            System.out.println("Enter Details for User "+i);
            addcontact(memberinfo);
        }

    }
}