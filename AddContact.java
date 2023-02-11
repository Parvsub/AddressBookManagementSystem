package addressBookMangementSystem;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Address book program
public class AddContact extends ContactCreate {
    public static AddContact newcontact = new AddContact();
    public static ArrayList<ContactCreate> contact = new ArrayList<>();

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        newcontact.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        newcontact.setLastName(scanner.nextLine());
        System.out.println("Enter address");
        newcontact.setAddress(scanner.nextLine());
        System.out.println("Enter city");
        newcontact.setCity(scanner.nextLine());
        System.out.println("Enter state");
        newcontact.setState(scanner.nextLine());
        System.out.println("Enter zip code");
        newcontact.setZip(scanner.nextLine());
        System.out.println("Enter phone number");
        newcontact.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Email");
        newcontact.setEmail(scanner.nextLine());
        ContactCreate contactPerson = new ContactCreate(newcontact.getFirstName(), newcontact.getLastName(),
                newcontact.getAddress(), newcontact.getCity(), newcontact.getState(), newcontact.getZip(),
                newcontact.getPhoneNumber(), newcontact.getEmail());
        contact.add(contactPerson);
        System.out.println(contact);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int choice;
        System.out.println("Welcome to Address Book Program");

        while (flag != 1) {
            System.out.println("Enter 1 to add contact details");

            System.out.println("Enter 4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                add();
            }
            {
                flag = 1;
            }
        }
    }
}