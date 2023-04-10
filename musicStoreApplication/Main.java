package org.example.studies.oopApplications.musicStoreApplication;


import org.example.studies.oopApplications.musicStoreApplication.customer.Customer;
import org.example.studies.oopApplications.musicStoreApplication.album.Album;
import org.example.studies.oopApplications.musicStoreApplication.song.Song;
import org.example.studies.oopApplications.musicStoreApplication.packages.Bronze;
import org.example.studies.oopApplications.musicStoreApplication.packages.Gold;
import org.example.studies.oopApplications.musicStoreApplication.packages.Silver;
import org.example.studies.oopApplications.musicStoreApplication.payment.Payment;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Customer customer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer = new Customer();

        System.out.println("Welcome To Music Company!\n");
        System.out.println("Please choose your subscription type :\n1-Gold\n2-Silver\n3-Bronz\n");
        int packageType = Integer.parseInt(sc.nextLine());

        switch (packageType) {
            case 1 -> customer.setPaket(new Gold());
            case 2 -> customer.setPaket(new Silver());
            case 3 -> customer.setPaket(new Bronze());
        }

        mainMenu();
    }


    public static void listAllSongs() {
        for (Song song : Album.INSTANCE.getSongs()) {
            System.out.printf("%d - %s - %d TL%n", song.getId(), song.getName(), song.getPrice());
        }

        selectSong(Album.INSTANCE.getSongs());
    }

    public static void selectSong(List<Song> list) {
        Scanner sc = new Scanner(System.in);
        int select = Integer.parseInt(sc.nextLine());

        System.out.printf("%s Add to basket ?%n", list.get(select - 1).getName());
        System.out.print("1-Yes\n2-No\n");

        int yesNo = Integer.parseInt(sc.nextLine());

        if (yesNo == 1) {
            System.out.println("Added to basket");
            customer.getCart().getList().add(list.get(select - 1));
            System.out.println("1-Back to Main Menu\n2-Go To Basket\n");

            select = Integer.parseInt(sc.nextLine());
            if (select == 1) {
                mainMenu();
            } else {
                showCart();
            }
        } else {
            mainMenu();
        }
    }

    private static void showCart() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Basket total: %d%n", customer.getCart().calculateOrder(customer.getPaket()));

        System.out.printf("Do you want to confirm the payment?%n");
        System.out.print("1-Yes\n2-No\n");

        int yesNo = Integer.parseInt(sc.nextLine());

        if (yesNo == 1) {
            System.out.println("Choose Your Payment Method:");
            System.out.println("1- Kredi Kartı");
            System.out.println("2- Telephone");
            System.out.println("3- Gift Card");
            System.out.println("0- EXIT");

            int select = Integer.parseInt(sc.nextLine());

            if (select != 0) {
                Payment.pay(select, customer);
                System.out.println("Payment complete");
                customer.getSongs().addAll(customer.getCart().getList());
                customer.getCart().getList().removeAll(customer.getCart().getList());
            }
        }
        mainMenu();
    }

    private static void mainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Main menu");
        System.out.println("1- ALL SONGS");
        System.out.println("2- MY BASKET");
        System.out.println("3- MY LIBRARY");
        System.out.println("0- EXIST");

        int select = Integer.parseInt(sc.nextLine());

        switch (select) {
            case 1 -> listAllSongs();
            case 2 -> showCart();
            case 3 -> showLibrary();
        }
    }

    private static void showLibrary() {
        for (Song song : customer.getSongs()) {
            System.out.println(song.getName());
        }

        mainMenu();
    }
}
