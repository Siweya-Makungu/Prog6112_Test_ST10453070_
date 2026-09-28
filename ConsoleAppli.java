package com.mycompany.consoleappli;

import java.util.Scanner;

public class ConsoleAppli {

    // Interface
    interface IConsole {

        String getConsoleType();

        String getStore();

        int getTotalSales();
    }

    // Abstract Console class
    abstract static class Console implements IConsole {

        protected String consoleType;
        protected String storeName;
        protected int totalSales;

        // Constructor
        public Console(String consoleType, String storeName, int totalSales) {
            this.consoleType = consoleType;
            this.storeName = storeName;
            this.totalSales = totalSales;
        }

        // Get console type
        public String getConsoleType() {
            return consoleType;
        }

        // Get store name
        public String getStore() {
            return storeName;
        }

        // Get total sales
        public int getTotalSales() {
            return totalSales;
        }

        // Abstract printReport method
        public abstract void printReport();
    }

    // ConsoleSales subclass
    static class ConsoleSales extends Console {

        // Constructor
        public ConsoleSales(String consoleType, String storeName, int totalSales) {
            super(consoleType, storeName, totalSales);
        }

        // Print report
        public void printReport() {
            System.out.println();
            System.out.println("----- CONSOLE SALES REPORT -----");
            System.out.println("Console Type: " + getConsoleType());
            System.out.println("Store Name: " + getStore());
            System.out.println("Total Sales: " + getTotalSales());
            System.out.println("--------------------------------");
        }
    }

    // Main application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("CONSOLE SALES APPLICATION");
        System.out.println("=========================");

        // Select console type
        System.out.println("Select a console device:");
        System.out.println("1. PS5");
        System.out.println("2. Xbox");
        System.out.println("3. Nintendo Switch");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "Xbox";
        } else if (choice == 3) {
            consoleType = "Nintendo Switch";
        } else {
            consoleType = "Unknown";
        }

        // Enter store name
        System.out.print("Enter store name: ");
        String storeName = input.nextLine();

        // Enter total sales
        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Create ConsoleSales object
        ConsoleSales sales = new ConsoleSales(
                consoleType,
                storeName,
                totalSales
        );

        // Print report
        sales.printReport();

        input.close();
    }
}