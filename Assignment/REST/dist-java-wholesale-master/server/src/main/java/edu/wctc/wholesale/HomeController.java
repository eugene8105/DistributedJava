package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.WholeSaleOrderService;

@Controller
public class HomeController {

    @Autowired
    private WholeSaleOrderService wholeSaleOrderService;

    @RequestMapping("/")
    public String showAllOrders(Model model) {

        return "index";
    }

}
