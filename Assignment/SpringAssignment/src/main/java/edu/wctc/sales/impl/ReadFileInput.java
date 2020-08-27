package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileInput implements SalesInput {
    @Override
    public List<CustomerSale> getSalesInput() {
        String fileName = "sales.txt";
        List<CustomerSale> people = new ArrayList<CustomerSale>();
        try {
            File f = new File(fileName);
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split(",");
                String customer = details[0];
                String country = details[1];
                double amount = Double.valueOf(details[2]);
                double tax = Double.valueOf(details[3]);
                double shipping = 0.0;
                CustomerSale p = new CustomerSale(customer, country, amount, tax, shipping);
                people.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return people;
    }
}
