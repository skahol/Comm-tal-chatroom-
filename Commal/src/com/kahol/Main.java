package com.kahol;

import java.util.Scanner;

public class Main {

    public static void printInstructions(){
        System.out.println("\t\t\tPress :");
        System.out.println("\t\t\t\t0 - To print instructions");
        System.out.println("\t\t\t\t1 - Sign up (user)");      // tutor
        System.out.println("\t\t\t\t2 - Sign up (Alumni)");
        System.out.println("\t\t\t\t3 - Log in (user)");
        System.out.println("\t\t\t\t4 - Log in (Alumni)");
        System.out.println("\t\t\t\t5 - Log in (Admin)");
        System.out.println("\t\t\t\t6 - QUIT the application");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isQuit = false;
        System.out.println("*************************************************************");
        System.out.println("\n\t\t\t\t\tWelcome to COM-tal");
        printInstructions();
        Commal com = new Commal();
        while(!isQuit) {
            System.out.print("\nEnter your choice :");
            int choice = scanner.nextInt();
           // scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    com.signUser();
                    break;
                case 2:
                    com.signAlumni();
                    break;
                case 3:
                    com.logUser();
                    break;
                case 4:
                    com.logAlumni();
                    break;
                case 5:
                    com.logAdmin();
                    break;
                case 6:
                    isQuit=true;
                    break;
            }
        }
    }
}
