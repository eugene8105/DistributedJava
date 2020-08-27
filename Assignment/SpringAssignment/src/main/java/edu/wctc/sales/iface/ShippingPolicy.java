package edu.wctc.sales.iface;

import edu.wctc.sales.CustomerSale;

public interface ShippingPolicy {
    double getShippingCost(CustomerSale sale);
}
