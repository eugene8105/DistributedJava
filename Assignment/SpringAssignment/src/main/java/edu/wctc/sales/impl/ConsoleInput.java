package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {

    public Scanner scanner = new Scanner(System.in);
    List<CustomerSale> people = new ArrayList<>();

    @Override
    public List<CustomerSale> getSalesInput() {
        int userChoice = 0;
        while(userChoice != 2) {
            System.out.println("1 To add Customer:");
            System.out.println("2 To Quite: ");
            String input = scanner.nextLine();
            try {
                userChoice = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Not a number.");
            }

            if(userChoice != 2) {
                addCustomer(people);
            }
        }
        return people;
    }

    private void addCustomer(List<CustomerSale> cst) {
        System.out.flush();
        String temp = "";

        System.out.println("Customer Name? ");
        String customer = scanner.nextLine();

        System.out.println("Customer Country? ");
        String country = scanner.nextLine();

        System.out.println("Amount spend? ");
        temp = scanner.nextLine();
        double amount = Double.parseDouble(temp);

        System.out.println("Taxes applied? ");
        temp = scanner.nextLine();
        double tax = Double.parseDouble(temp);

        double shipping = 0.0;

        cst.add(new CustomerSale(customer, country, amount, tax, shipping));
    }
}
