package bank;

import java.util.Scanner;


public class BankAccount {
    int balance;
    int previousTransection;
    String costumerName;
    String costumerId;

    public BankAccount(String cName, String cID) {
        costumerName = cName;
        costumerId = cID;

    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransection = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransection = -amount;
        }
    }

    void getPreviousTransection() {
        if (previousTransection > 0) {
            System.out.println("Deposited " + previousTransection);
        } else if (previousTransection < 0) {
            System.out.println("Withdrawn" + Math.abs(previousTransection));
        } else {
            System.out.println("No Transectin Occured");

        }
    }
        void showMenu ()
        {
            char option = '\0';
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome " + costumerName);
            System.out.println("costumerId " + costumerId);
            System.out.println("\n");
            System.out.println("A.check Balance");
            System.out.println("B.Deposit");
            System.out.println("C.Withdraw");
            System.out.println("D.PreviousTransection");
            System.out.println("E.Exit");

            do {
                System.out.println(-------------------------------------------);
                System.out.println("enter the Option");
                System.out.println(-------------------------------------------);
                option = sc.next().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println(-------------------------------------------);
                        System.out.println("Balance " + balance);
                        System.out.println(-------------------------------------------);
                        System.out.println("\n");
                    case 'B':
                        System.out.println(-------------------------------------------);
                        System.out.println("Enter an amount to deposite:");
                        System.out.println(-------------------------------------------);
                        int amount = sc.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;
                    case 'C':
                        System.out.println(----------------------------------------------);
                        System.out.println("Enter an amount to Withdraw");
                        System.out.println(----------------------------------------------);
                        int amount2 = sc.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;
                    case 'D':
                        System.out.println(----------------------------------------------);
                        getPreviousTransection();
                        System.out.println(----------------------------------------------);
                        System.out.println("\n");
                        break;
                    case 'E':
                        System.out.println(----------------------------------------------);
                        break;
                    default:
                        System.out.println("Invalid Option..Please Enter Again");
                        break;
                }
            }
            while (option != 'E');
            {
                System.out.println("Thank You visit again");
            }

        }
    }


