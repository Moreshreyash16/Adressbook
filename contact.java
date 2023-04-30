package Bridgelabz.Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class contact extends Adressbook {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        Adressbook ab = new Adressbook();
        while (1 < 2) {
            System.out.println("Enter number \n 1-Add \n 2-Show \n 4-exit");
            int num = sc.nextInt();
            if (num == 1) {
                ab.Addcontact();
            }
             else if (num == 2) {
                ab.show();
            } else {
                break;
            }
        }
    }

}
