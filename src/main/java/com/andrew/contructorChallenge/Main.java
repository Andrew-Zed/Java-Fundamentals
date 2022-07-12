package com.andrew.contructorChallenge;

public class Main {
    public static void main(String[] args) {
    Account paulsAccount = new Account(); //("12345", 0.00, "Paul Smith", "paul@gmail.com", "(234) 8029886644");

        System.out.println(paulsAccount.getCustomerName());
        System.out.println(paulsAccount.getCustomerEmailAddress());
        System.out.println(paulsAccount.getNumber());
        System.out.println("Account Balance = " + paulsAccount.getBalance());

    paulsAccount.withdrawal(500);
    paulsAccount.deposit(1000);
    paulsAccount.withdrawal(550);
    paulsAccount.deposit(1000);
    paulsAccount.withdrawal(500);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob ", 2500);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Andy", 300, "andy@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
