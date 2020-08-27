package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.SalesReport;

import java.util.List;

public class SalesDetailReport implements SalesReport{

    @Override
    public void generateReport(List<CustomerSale> salesList) {
        System.out.println("Sales Detail Report");
//        for(CustomerSale s : salesList) {
//            System.out.print(s.getCustomer());
//            System.out.printf("%10.2f\n",s.getAmount());
//        }
        for(CustomerSale s : salesList) {
            System.out.println( s.getCustomer() + "             "
                            +   s.getCountry()  + "             "
                            +   s.getAmount()   + "             "
                            +   s.getAmount()   + "             "
                            +   s.getShipping()
            );
        }
    }
}
