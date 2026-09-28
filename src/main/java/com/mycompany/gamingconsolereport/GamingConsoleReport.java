
package com.mycompany.gamingconsolereport;


public class GamingConsoleReport {

    public static void main(String[] args) {

       
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        
        String[] consoles = {"PS5", "Xbox", "Nintendo Switch"};

      
        int[][] sales = {
            {1000, 2000, 3000},  
            {2000, 3000, 4000},  
            {1500, 1100, 1200}   
        };

        System.out.println("==============================================");
        System.out.println("       NUMBER 1 ELECTRONICS FRANCHISE");
        System.out.println("              YEARLY SALES REPORT");
        System.out.println("==============================================");

        System.out.printf("%-20s %-10s %-10s %-18s%n",
                "City", "PS5", "Xbox", "Nintendo Switch");

        System.out.println("--------------------------------------------------------------");

      
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %-10d %-10d %-18d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println("==============================================================");

        
        System.out.println();
        System.out.println("              TOTAL SALES PER CITY");
        System.out.println("==============================================================");

        int grandTotal = 0;

        
        int highestSales = 0;
        String highestCity = "";

        
        for (int i = 0; i < cities.length; i++) {

            int cityTotal = 0;

            for (int j = 0; j < consoles.length; j++) {
                cityTotal = cityTotal + sales[i][j];
            }

            System.out.println(cities[i] + ": " + cityTotal);

          
            grandTotal = grandTotal + cityTotal;

           
            if (cityTotal > highestSales) {
                highestSales = cityTotal;
                highestCity = cities[i];
            }
        }

        System.out.println("==============================================================");

       

        System.out.println("==============================================================");

        System.out.println("CITY WITH THE MOST SALES");
System.out.println("==============================================================");
System.out.println(highestCity);
System.out.println("==============================================================");
 
    }
}
