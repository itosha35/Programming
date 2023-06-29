package Seminar_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class program {
    public static Boolean close = false;
    public static final int assortment = 10; // amount for shop assortment
    public static ArrayList<laptop> notes = new ArrayList<laptop>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (notes.isEmpty()) {
            notes = loadGenerator(assortment);
        }
        // showNoteBooks(notes);
        while (!close) {
            System.out.println("Hello to NOTEBOOKS Shop!");
            System.out.println("1 - SHOW ASSORTMENT");
            System.out.println("2 - SEARCH (input parameters & show)");
            System.out.println("3 - EXIT");
            System.out.print("Please, set what You want to do: ");
            int choice = input.nextInt();             
            switch (choice) {
                case (1): {
                    System.out.println("------------------------");
                    System.out.println(">>> SHOP ASSORTMENT >>>");
                    showNoteBooks(notes);
                    System.out.println("------------------------");
                    main(args);
                    break;
                }
                case (2): {
                    ArrayList<laptop> filtered = new ArrayList<laptop>();
                    laptop dummy = new laptop();
                    Boolean parset = false;
                    while (!parset) {
                        System.out.println("Please, chose parameter for Filter");
                        System.out.println("1 - BRAND");
                        System.out.println("2 - COLOR");
                        System.out.println("3 - HDD");
                        System.out.println("4 - RAM");
                        System.out.println("5 - SYSTEM");
                        System.out.println("6 - Close Filter");
                        System.out.print("Input Your choise: ");
                        choice = input.nextInt();
                        String line = "";
                        switch (choice) {
                            case (1): {
                                System.out.print("Input Brand: ");
                                line = input.next().toString();
                                dummy.setBrand(line);
                                break;
                            }
                            case (2): {
                                System.out.print("Input Color: ");
                                line = input.next().toString();
                                dummy.setColor(line);
                                break;
                            }
                            case (3): {
                                System.out.print("Input HDD: ");
                                line = input.next().toString();
                                dummy.setHdd(line);
                                break;
                            }
                            case (4): {
                                System.out.print("Input RAM: ");
                                line = input.next().toString();
                                dummy.setRam(line);
                                break;
                            }
                            case (5): {
                                System.out.print("Input OS System: ");
                                line = input.next().toString();
                                dummy.setOs_type(line);
                                break;
                            }
                            case (6): {
                                System.out.println("---FILTER CREATED---");
                                System.out.println(dummy);
                                System.out.println("--------------------");
                                parset = true;
                                break;
                            }
                            default: {
                                parset = true;
                                break;
                            }
                        }
                    }                    
                    for (laptop lap : notes) {
                        if (lap.equalto(dummy)){
                            filtered.add(lap);
                        }
                    }                    
                    System.out.println("Filterred elements: ");
                    showNoteBooks(filtered);                    
                    System.out.println("--------------------");
                    main(args);
                    break;
                }
                case (3): {
                    close = true;
                    System.out.println("See You soon!");
                    main(args);
                    break;
                }
                default: {
                    close = true;
                    System.out.println("See You soon!");
                    main(args);
                    break;
                }
            }
        }
        input.close();
    }

    public static ArrayList<laptop> loadGenerator(Integer amount) {
        ArrayList<laptop> set = new ArrayList<laptop>();
        Random rand = new Random();
        ArrayList<String> brands = new ArrayList<String>(Arrays.asList("ASUS", "DELL", "ACER", "TOSHIBA", "APPLE"));
        ArrayList<String> colors = new ArrayList<String>(Arrays.asList("red", "black", "white", "grey"));
        ArrayList<String> models = new ArrayList<String>(
                Arrays.asList("office", "gamer", "workstation", "light", "designer"));
        ArrayList<String> memory = new ArrayList<String>(Arrays.asList("4GB", "8GB", "16GB", "32GB"));
        ArrayList<String> hards = new ArrayList<String>(Arrays.asList("256GB SSD", "512GB SSD", "1TB", "2TB"));
        ArrayList<String> os_systems = new ArrayList<String>(
                Arrays.asList("WINDOWS", "FreeBSD", "Linux", "NONE", "UBUNTU", "MacOS"));
        for (int index = 0; index < amount; index++) {
            laptop dummy = new laptop();
            int rnd = rand.nextInt(brands.size());
            dummy.setBrand(brands.get(rnd));
            rnd = rand.nextInt(colors.size());
            dummy.setColor(colors.get(rnd));
            rnd = rand.nextInt(models.size());
            dummy.setModel(models.get(rnd));
            rnd = rand.nextInt(memory.size());
            dummy.setRam(memory.get(rnd));
            rnd = rand.nextInt(hards.size());
            dummy.setHdd(hards.get(rnd));
            rnd = rand.nextInt(os_systems.size());
            dummy.setOs_type(os_systems.get(rnd));
            dummy.setWeight(rand.nextInt(7) + 1);
            dummy.setNew_one(rand.nextBoolean());
            set.add(dummy);
        }
        return set;
    }

    public static void showNoteBooks(ArrayList<laptop> set) {
        for (laptop laptop : set) {
            System.out.println(laptop);
        }
    }

}
