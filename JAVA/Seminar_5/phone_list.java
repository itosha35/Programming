package Seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phone_list {
    public static boolean close = false;
    public static Map<String, ArrayList<String>> Book = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        if (Book.isEmpty()) {
            loadBook(Book);
        }
        while (!close) {
            System.out.println("Hello to Phone Book!");
            System.out.println("1 - ADD CONTACT");
            System.out.println("2 - SHOW ALL");
            System.out.println("3 - REMOVE CONTACT");
            System.out.println("4 - EXIT");
            System.out.print("Please, enter Your choice = ");
            int choice = input.nextInt();
            switch (choice) {
                case (1): {
                    System.out.print("Please, ENTER the Name = ");
                    name = input.next().toString();
                    System.out.println("Please, ENTER the number(s) of Contact (Please, use comma for split): ");
                    String telnums = input.next().toString();
                    System.out.println(telnums);
                    addContact(Book, name, telnums);
                    main(args);
                    break;
                }
                case (2): {
                    System.out.printf("____ALL CONTACTS(%d)____ \n", Book.size());
                    showAll(Book);
                    main(args);
                    break;
                }
                case (3): {
                    System.out.print("Please, ENTER the Name You want to DELETE = ");
                    name = input.next().toString();
                    removeContact(Book, name);
                    main(args);
                    break;
                }
                case (4): {
                    close = true;
                    System.out.println("BYE-BYE!!!");
                    main(args);
                    break;
                }
                default: {
                    close = true;
                    main(args);
                    break;
                }
            }

        }
        input.close();
    }

    public static void removeContact(Map<String, ArrayList<String>> Book, String name) {
        if (!Book.containsKey(name)) {
            System.out.println("No " + name + " is in the Book!");
        } else {
            Book.remove(name);
            System.out.println(name + " has been deleted!");
        }
    }

    public static void addContact(Map<String, ArrayList<String>> Book, String name, String telephones) {
        ArrayList<String> tellist = new ArrayList<>(Arrays.asList(telephones.split(",")));
        System.out.println(tellist);
        if (Book.containsKey(name)) {
            System.out.println(name + " is already in Book!");
            Book.put(name, tellist);
            System.out.println(">>> Contact " + name + " has been Updated! >>>");
        } else {
            Book.put(name, tellist);
            System.out.println(">>> Contact " + name + " has been added >>>");
        }
    }

    public static void showAll(Map<String, ArrayList<String>> Book) {
        // sorting
        ArrayList<Integer> seqV = new ArrayList<>();
        ArrayList<String> seqN = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> pair : Book.entrySet()) {
            seqV.add(pair.getValue().size());
            seqN.add(pair.getKey());
        }
        for (int i = 0; i < seqN.size() - 1; i++) {
            for (int j = 0; j < seqN.size() - 1 - i; j++) {
                if (seqV.get(j)<=seqV.get(j+1)){
                    int temp = seqV.get(j);
                    seqV.set(j, seqV.get(j+1));
                    seqV.set(j+1, temp);
                    String stemp = seqN.get(j);
                    seqN.set(j, seqN.get(j+1));
                    seqN.set(j+1, stemp);
                }
            }            
        }
        // output
        /*for (Map.Entry<String, ArrayList<String>> pair : Book.entrySet()) {
            System.out.println("Name " + pair.getKey());
            System.out.println("Telephones:" + pair.getValue());
        }
        */
        for (String name : seqN) {
            System.out.println("Name " + name);
            System.out.println("Telephones:" + Book.get(name));
        }
    }

    public static void loadBook(Map<String, ArrayList<String>> Book) {
        Book.put("Anton", new ArrayList<>(Arrays.asList("1231", "2323", "4445")));
        Book.put("Alena", new ArrayList<>(Arrays.asList("000", "000", "0000")));
        Book.put("Alexey", new ArrayList<>(Arrays.asList("91231", "4445")));
        Book.put("Petya", new ArrayList<>(Arrays.asList("881")));
        Book.put("Serega", new ArrayList<>(Arrays.asList("0999", "45546", "45", "2342368")));
    }

}
