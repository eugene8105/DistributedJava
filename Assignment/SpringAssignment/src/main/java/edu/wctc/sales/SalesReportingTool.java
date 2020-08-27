package edu.wctc.sales;

import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SalesReportingTool {

    private SalesInput in;
    private SalesReport out;
    private ShippingPolicy sp;
    List<CustomerSale> sale = new ArrayList<>();

    @Autowired
    public SalesReportingTool(SalesInput in, SalesReport out, ShippingPolicy sp) {
        this.in = in;
        this.out = out;
        this.sp = sp;
    }

    public void createReport() {
        readData();
        createShippingPolicy();
        generateReport();
    }

    public void readData() {
        sale = in.getSalesInput();
    }

    public void createShippingPolicy() {
        for(CustomerSale s : sale) {
            s.setShipping(sp.getShippingCost(s));
        }
    }

    public void generateReport() {
        out.generateReport(sale);
    }
}
