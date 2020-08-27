package edu.wctc.sales.iface;

import edu.wctc.sales.CustomerSale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<CustomerSale> salesList);
}
