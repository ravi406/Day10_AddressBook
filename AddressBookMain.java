package com.day10.practice;

import java.util.Scanner;

public class AddressBookMain {
    //creating Instance Variable

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private double phoneNumber;
    private String email;
    private int zip;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public static void main(String[] args) {

        System.out.println("******* Welcome To AddressBook Program *******");

        Scanner sc=new Scanner(System.in);
        AddressBookMain person = new AddressBookMain();

        System.out.println("Enter your FirstName :");
        person.setFirstName(sc.next());

        System.out.println("Enetr your lastName :");
        person.setLastName(sc.next());

        System.out.println("Enter your Address :");
        person.setAddress(sc.next());

        System.out.println("Enter your city :");
        person.setCity(sc.next());

        System.out.println("Enter your state :");
        person.setState(sc.next());

        System.out.println("Enter your Phone Number :");
        person.setPhoneNumber(sc.nextDouble());

        System.out.println("Enter your Zip Number:");
        person.setZip(sc.nextInt());
    }

}
