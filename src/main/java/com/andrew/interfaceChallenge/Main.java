package com.andrew.interfaceChallenge;

public class Main {
    public static void main(String[] args) {
        ITelephone andyPhone;
        andyPhone = new DeskPhone(234802222);
        andyPhone.powerOn();
        andyPhone.callPhone(234802222);
        andyPhone.answer();

        andyPhone = new MobilePhone(234703513);
        andyPhone.powerOn();
        andyPhone.callPhone(234703513);
        andyPhone.answer();
    }
}
