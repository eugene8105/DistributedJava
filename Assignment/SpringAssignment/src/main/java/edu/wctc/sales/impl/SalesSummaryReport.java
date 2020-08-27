package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.SalesReport;

import java.util.List;

public class SalesSummaryReport implements SalesReport {
    @Override
    public void generateReport(List<CustomerSale> salesList) {
        System.out.println("Sales Summary Report");
        for(CustomerSale s : salesList) {
            System.out.println(s.getCountry()   + "             "
                            +   s.getAmount()   + "             "
                            +   s.getAmount()   + "             "
                            +   s.getShipping()
            );
        }
    }
}
