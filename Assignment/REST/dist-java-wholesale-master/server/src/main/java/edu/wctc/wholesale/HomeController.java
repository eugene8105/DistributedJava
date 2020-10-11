package edu.wctc.wholesale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.WholeSaleOrderService;

@RestController
public class HomeController {

    @Autowired
    private WholeSaleOrderService wholeSaleOrderService;

    @RequestMapping("/")
    public String showAllOrders(Model model) {

        return "index";
    }

}
