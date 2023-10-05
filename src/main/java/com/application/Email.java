package com.application;

import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int defaultPasswordLength = 10;
  private int mailBoxCapacity = 500;
  private String alternateEmail;
  private String companySuffix = ".company.com";

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created: " + firstName + " " + lastName);
    this.department = setDepartment();
    System.out.println(department);
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: " + this.password);
    email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + companySuffix;
    System.out.println("Your email is: " + email);
  }

  public String setDepartment() {
    System.out.println("Department Codes:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter Department code:");
    Scanner in = new Scanner(System.in);
    int depChoice = Integer.valueOf(in.nextLine());
    in.close();

    if(depChoice == 1) {
      return "Sales";
    } else if(depChoice == 2) {
      return "Development";
    } else if(depChoice == 3) {
      return "Accounting";
    } else {
      return + depChoice + " is not a valid code.";
    }
  }

  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@£$%&";
    char[] password = new char[length];
    for (int i = 0; i < length; i++){ 
     int randomNumber = (int)(Math.random() * passwordSet.length());
     password[i] = passwordSet.charAt(randomNumber);
    }
    return new String(password);
  }

  public void setMailBoxCapaxity(int capacity) {
    this.mailBoxCapacity = capacity;
  }

  public void setAlternateEmail(String altEmail) {
    this.alternateEmail = altEmail;
  }

  public void changePassword(String newPassword) {
    this.password = newPassword;  
  }

  public int getMailBoxCapacity() {
    return mailBoxCapacity; 
  }

  public String getAlternateEmail() {
    return alternateEmail;
  }

  public String getPassword() {
    return password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
