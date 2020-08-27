package edu.wctc.sales.impl;

import edu.wctc.sales.CustomerSale;
import edu.wctc.sales.iface.ShippingPolicy;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy {
    @Override
    public double getShippingCost(CustomerSale sale) {
        if(sale.getCountry().equals("United States")) {
            sale.setShipping(29.95);
        } else if(sale.getCountry().equals("Japan")) {
            sale.setShipping(14.50);
        } else if(sale.getCountry().equals("Scotland")) {
            sale.setShipping(7.54);
        } else if(sale.getCountry().equals("India")) {
            sale.setShipping(11.79);
        } else {
            sale.setShipping(25.00);
        }
        return sale.getShipping();
    }
}
