package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.ShippingPolicy;

public class FreeShippingPolicy implements ShippingPolicy {

    @Override
    public double getShippingCost(CustomerSale customerSale) {
        customerSale.setShipping(0.0);
        return customerSale.getShipping();
    }
}
