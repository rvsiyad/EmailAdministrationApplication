package com.application;

public class EmailApp 
{
    public static void main( String[] args )
    {
        Email email1 = new Email("Roble", "Siyad");
        email1.setAlternateEmail("newEmail@company.com"); 
        System.out.println(email1.getAlternateEmail());
    }
}