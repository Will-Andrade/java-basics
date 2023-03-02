package com.will.scope;

public class Scopes {
  double balance = 10.0;

  public static void main (String[] args) {
    calculateExponentialDebt();
  }

  public void withdraw(double value) {
    double newBalance = balance - value;

    printBalance(newBalance);
  }

  public void printBalance (double newBalance) {
    System.out.println("Original balance: " + balance);
    System.out.println("Your final balance " + newBalance); // Error unless received via params3
  }

  public static void calculateExponentialDebt () {
    double installmentValue = 50.0;
    double installmentsTotal = 0.0;

    for (int i = 1; i < 10; i++) {
      double calculatedInstallment = installmentValue * i;
      installmentsTotal += calculatedInstallment;
    }

    System.out.println(installmentsTotal);
  }
}
