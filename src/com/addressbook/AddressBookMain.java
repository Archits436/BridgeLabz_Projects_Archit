package com.addressbook;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Contact> memberinfo = new HashMap<>();
        AddressBook functions = new AddressBook();

        do{
            System.out.println("Enter your Choice: ");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            i = sc.nextInt();
            sc.nextLine();

            if(i==1){
                functions.addcontact(memberinfo);
            }
            else if(i==2){
                functions.editcontact(memberinfo);
            }
            else if(i==3){
                functions.deletecontact(memberinfo);
            }
            else{
                System.out.println("Invalid Option !!!");
            }

        }while(i!=4);
    }
}