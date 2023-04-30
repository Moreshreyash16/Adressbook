package Bridgelabz.Day8;

import java.util.ArrayList;
import java.util.Scanner;
public class Adressbook {
    public String firstName, LastName, Address, city, State;
    public int pincode;
    public int phoneNumber;

    public Adressbook() {

    }
    Scanner sc = new Scanner(System.in);
    ArrayList list = new ArrayList();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        list.add(firstName);
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
        list.add(lastName);
    }

    public void setAddress(String address) {
        this.Address = address;
        list.add(address);
    }

    public void setCity(String city) {
        this.city = city;
        list.add(city);
    }

    public void setState(String state) {
        this.State = state;
        list.add(state);
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
        list.add(pincode);
    }
        public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.add(phoneNumber);
    }
        public void show() {
        System.out.println(list);
    }
    public void Addcontact() {

        while (true) {
            System.out.println("Enter a number to Add ::\n 1 - First name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - address \n 4 - pincode \n 7 - phonenumber \n 8- Display \n 9- to return to main menu ");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Enter the firstname");
                String fn = sc.next();
                setFirstName(fn);
            } else if (n == 2) {
                System.out.println("Enter the Lastname");
                String ln = sc.next();
                setLastName(ln);
            } else if (n == 3) {
                System.out.println("Enter the City");
                String city = sc.next();
                setCity(city);
            } else if (n == 4) {
                System.out.println("Enter the State");
                String state = sc.next();
                setState(state);
            } else if (n == 5) {
                System.out.println("Enter the Address");
                String adrr = sc.next();
                setAddress(adrr);
            } else if (n == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                setPhoneNumber(phone);
            } else if (n == 7) {
                System.out.println("Enter the Pincode");
                int pin = sc.nextInt();
                setPincode(pin);
            } else if (n == 8) {
                show();
            } else {
                break;
            }
        }
    }

    }

