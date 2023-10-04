package com.application;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailBoxCapacity;
  private String alternateEmail;

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created: " + firstName + " " + lastName);
    this.department = setDepartment();
    System.out.println(department);
    this.password = randomPassword(8);
  }

  public String setDepartment() {
    System.out.println("Department Codes:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter Department code:");
    Scanner in = new Scanner(System.in);
    int depChoice = Integer.valueOf(in.nextLine());
    in.close();
    if(depChoice == 1) {
      return "Department: Sales";
    } else if(depChoice == 2) {
      return "Department: Development";
    } else if(depChoice == 3) {
      return "Department: Accounting";
    } else {
      return + depChoice + " is not a valid code.";
    }
  }

  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@£$%&";
    char[] password = new char[length];
    for (int i = 0; i < length; i++){ 
     int randomNumber = (int)Math.random() * passwordSet.length();
     password[i] = passwordSet.charAt(randomNumber);
    }
    return new String(password);
  }
}
