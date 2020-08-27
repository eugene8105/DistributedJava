package edu.wctc.sales;

import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import edu.wctc.sales.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new ReadFileInput();
        //return new ConsoleInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new SalesDetailReport();
        //return new SalesDetailReport();
    }
    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FlatRateDomesticShippingPolicy();
        //return new FreeShippingPolicy();
    }
}
