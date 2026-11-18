/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.localcompany;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int months = 3;
        int[][] sales = new int[products.length][months];

        for (int p = 0; p < products.length; p++) {
            for (int m = 0; m < months; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + products[p] + " mattress: ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);

        printer.PrintHeader();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }
}




