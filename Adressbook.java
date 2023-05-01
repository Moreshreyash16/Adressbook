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

    public void updateFirstName(int f, String firstName) {
        this.firstName = firstName;

        list.set(f, firstName);

    }

    public void updateLastName(int l, String lastName) {
        this.LastName = lastName;

        list.set(l, lastName);

    }


    public void updateAddress(int a, String address) {
        this.Address = address;
        list.set(a, address);

    }

    public void updateCity(int c, String city) {
        this.city = city;
        list.set(c, city);
    }

    public void updateState(int s, String state) {
        this.State = state;
        list.set(s, state);

    }

    public void updatePincode(int p, int pincode) {
        this.pincode = pincode;

        list.set(p, pincode);
    }

    public void updatePhoneNumber(int ph, int phoneNumber) {
        this.phoneNumber = phoneNumber;
        list.set(ph, phoneNumber);
    }


    public void show() {
        System.out.println(list);
    }

    public void delete() {
        list.clear();
        System.out.println(list);
    }

    public void Addcontact() {

        while (1 < 2) {
            System.out.println("Enter a number to update ::\n 1 - First name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - address \n 4 - pincode \n 7 - phonenumber \n 8- Display \n 9-To delete everything \n 10 to return to main menu ");
            int n = sc.nextInt();
//        int n = sc.nextInt();
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
            } else if (n == 9) {
                delete();
            } else {
                break;
            }
        }
    }
    public void updatecontact() {

        while (1 < 2) {
            System.out.println("Enter a number to update ::\n 1 - First name \n 2 - LastName \n 3 - City \n 4 - State\n 4 - address \n 4 - pincode \n 7 - phonenumber \n 8- Display \n 9-To delete everything \n 10 to return to main menu ");
            int u = sc.nextInt();
//        int n = sc.nextInt();
            if (u == 1) {
                System.out.println("Enter the firstname");
                String fn = sc.next();
                updateFirstName(0,fn);
            } else if (u == 2) {
                System.out.println("Enter the Lastname");
                String ln = sc.next();
                updateLastName(1,ln);
            } else if (u == 3) {
                System.out.println("Enter the City");
                String city = sc.next();
                updateCity(2,city);
            } else if (u == 4) {
                System.out.println("Enter the State");
                String state = sc.next();
                updateState(3,state);
            } else if (u == 5) {
                System.out.println("Enter the Address");
                String adrr = sc.next();
                updateAddress(4,adrr);
            } else if (u == 6) {
                System.out.println("Enter the Phone Number");
                int phone = sc.nextInt();
                updatePhoneNumber(5,phone);
            } else if (u == 7) {
                System.out.println("Enter the Pincode");
                int pin = sc.nextInt();
                updatePincode(6,pin);

            } else if (u == 8) {
                show();
            } else if (u == 9) {
                delete();
            } else {
                break;
            }
        }
    }

}

