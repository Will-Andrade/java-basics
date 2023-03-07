import java.util.Scanner;

/**
 * Bharak Banking
 * @author Willian Andrade
 * @version 1.0.0
 */

public class BankingAccount {
  static double balance = 0.00;
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Welcome to Bharak Banking! Do you want to create an account, make an withdraw or make a deposit?");
      String option = scan.nextLine();

      switch (option) {
        case "withdraw":
          System.out.println("Please inform a withdraw amount.");
          double withdrawAmount = scan.nextDouble();

          makeWithdraw(withdrawAmount);
          return;
        case "create":
          createAccount();
          return;
        case "deposit":
          System.out.println("Please inform how much value you would like to deposit.");
          double depositAmount = scan.nextDouble();

          makeDeposit(depositAmount);
          return;
        default:
          System.out.println("We from Bharak Banking appreciate your choice in banking systems! Have a great day.");
      }
    }
  }

  public static void createAccount () {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Please, give me your account number.");
      int accountNumber = scan.nextInt();

      System.out.println("Please, give me your agency code.");
      String agencyCode = scan.next();

      System.out.println("Please, give me your full name.");
      String clientName = scan.next();

      System.out.println("Please deposit a value to start your account.");
      balance = scan.nextDouble();

      System.out.println("Welcome " + clientName + ", thank your for creating an account with our bank, your agency is " + agencyCode + ", account number " + accountNumber + " and your current balance U$" + balance + " is already available for withdraw.");
    }
  }

  public static void makeWithdraw (double withdrawAmount) {
    if (withdrawAmount > balance) {
      System.out.println("Insufficient funds. Your current balance is U$" + balance + '.');
      return;
    }

    balance = balance - withdrawAmount;
    System.out.println("You have completed your withdraw of U$" + withdrawAmount + ". Your new balance is: U$" + balance + '.');
  }

  public static void makeDeposit (double depositAmount) {
    balance = balance + depositAmount;
    System.out.println("We at Bharak Banking appreciate your deposit. Your current balance is: U$" + balance + '.');
  }
}
