package addressBookMangementSystem;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Address book program
public class AddContact extends ContactCreate {
    public static AddContact newcontact = new AddContact();
    public static ArrayList<ContactCreate> contact = new ArrayList<>();
    public static void add(){
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
        ContactCreate contactPerson = new ContactCreate(newcontact.getFirstName(),newcontact.getLastName(),
                newcontact.getAddress(), newcontact.getCity(), newcontact.getState(), newcontact.getZip(),
                newcontact.getPhoneNumber(),newcontact.getEmail());
        contact.add(contactPerson);
        System.out.println(contact);
    }

    public static void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name whose contact to be edited");
        String name = scanner.nextLine();
        boolean found=false;
        ListIterator<ContactCreate> iterator = contact.listIterator();
        while (iterator.hasNext()){
            ContactCreate contact= iterator.next();
            if (name.equals(contact.getFirstName()))
            {
                System.out.println("Edit first name");
                newcontact.setFirstName(scanner.nextLine());
                System.out.println("Edit last name");
                newcontact.setLastName(scanner.nextLine());
                System.out.println("Edit address");
                newcontact.setAddress(scanner.nextLine());
                System.out.println("Edit city");
                newcontact.setCity(scanner.nextLine());
                System.out.println("Edit state");
                newcontact.setState(scanner.nextLine());
                System.out.println("Edit zip code");
                newcontact.setZip(scanner.nextLine());
                System.out.println("Edit phone number");
                newcontact.setPhoneNumber(scanner.nextLine());
                System.out.println("Edit Email");
                newcontact.setEmail(scanner.nextLine());
                iterator.set(new ContactCreate(newcontact.getFirstName(),newcontact.getLastName(),
                        newcontact.getAddress(), newcontact.getCity(), newcontact.getState(), newcontact.getZip(),
                        newcontact.getPhoneNumber(),newcontact.getEmail()));
                found=true;
            }

        }
        if (found){
            System.out.println("record is update");
            System.out.println(contact);
        }else {
            System.out.println("record not found");
        }
    }
    public static void delete(){
        Scanner scanner = new Scanner(System.in);
        boolean found=false;
        System.out.println("Enter the first name of contact to delete");
        String nameDelete;
        nameDelete = scanner.nextLine();
        ListIterator<ContactCreate> iterator = contact.listIterator();
        while (iterator.hasNext()) {
            ContactCreate contact = iterator.next();
            if (nameDelete.equals(contact.getFirstName())) {
                iterator.remove();
                found=true;
            }
        }
        if (found){
            System.out.println("record is deleted");
            System.out.println(contact);
        }else {
            System.out.println("record not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int choice;
        System.out.println("Welcome to Address Book Program");

        while (flag != 1) {
            System.out.println("Enter 1 to add contact details");
            System.out.println("Enter 2 to edit details");
            System.out.println("Enter 3 to delete contact");
            System.out.println("Enter 4 to exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                add();
            } else if (choice == 2) {
                edit();
            } else if (choice==3) {
                delete();
            } else if (choice == 4) {
                flag = 1;
            }
        }
    }
}