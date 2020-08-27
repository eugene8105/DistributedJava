package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.SalesReport;

import java.util.List;

public class SalesSummaryReport implements SalesReport {
    @Override
    public void generateReport(List<CustomerSale> salesList) {
        System.out.println("Sales Summary Report");
        System.out.printf("%-25s  %-25s  %-25s  %-25s",
                "Country", "Amount", "Tax", "Shipping");
        System.out.println();

        for(CustomerSale s : salesList) {
            System.out.printf("%-25s  %-25s  %-25s  %-25s\n",
                    s.getCountry(), s.getAmount(), s.getTax(), s.getShipping());
        }
    }
}
